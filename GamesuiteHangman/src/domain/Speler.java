package domain;

import domain.DomainException;

public class Speler {
	private String naam;
	private int score;
	
	public Speler (String naam){
		score = 0;
		if (naam == null || naam.trim().isEmpty()){
			throw new DomainException("Naam mag niet leeg zijn.");
		}
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Speler [naam=" + naam + ", score=" + score + "]";
	}
	
	public boolean equals(Speler speler){
		if(speler != null && this.score == speler.getScore() && this.naam.equals(speler.getNaam())){
			return true;
		}
		return false;
	}
	
	public void addToScore(int score){
		if(this.score + score < 0){
			throw new DomainException("De totale score mag niet negatief worden.");
		}
		this.score += score;
	}

}
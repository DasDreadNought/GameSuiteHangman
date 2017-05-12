package domain;

import sun.nio.cs.HistoricallyNamedCharset;

public class HangMan {
	Speler speler;
	TekeningHangman tekening;
	HintWoord woord;
	int fouten=0;
	public HangMan(Speler speler, WoordenLijst woorden){
		if(speler!=null){
			this.speler=speler;
		}
		tekening = new TekeningHangman();
		woord = new HintWoord(woorden.getRandomWoord());
		
	}
	
	public String getHint(){
		return woord.toString();
	}
	
	public Speler getSpeler(){
		return speler;
	}
	
	public TekeningHangman getTekening(){
		return tekening;
	}
	
	public void raad(char letter){
		if(!woord.raad(letter)){
			fouten++;
			if(fouten>=14){
				System.out.println("Lost");
			}
			tekening.zetVolgendeZichtbaar();
		} else {
			if(woord.isGeraden()){
				System.out.println("Correct");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

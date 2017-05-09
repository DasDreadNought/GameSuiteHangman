package domain;

public class LijnStuk {
	private Punt start;
	private Punt eind;
	
	public LijnStuk(Punt start, Punt eind){
		setStartEnEindPunt(start, eind);
	}
	
	public Punt getStartPunt() {
		return start;
	}

	public Punt getEindPunt() {
		return eind;
	}

	public void setStartEnEindPunt(Punt start, Punt eind){
		if(start == null || eind == null){
			throw new DomainException();
		}
		this.start = start;
		this.eind = eind;
	}
	
	@Override
	public String toString() {
		return "LijnStuk [start=" + start.toString() + ", eind=" + eind.toString() + "]";
	}

	public boolean equals(LijnStuk o){
		if(o == null){
			return false;
		}
		if(o.getEindPunt().equals(eind) && o.getStartPunt().equals(start) || o.getEindPunt().equals(start) && o.getStartPunt().equals(eind)){
			return true;
		}
		
		return false;
	}

}

package domain;

public class LijnStuk extends Vorm{
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


	@Override
	public boolean equals(Object o) {
		if(o instanceof LijnStuk&&o!=null){
			if((((LijnStuk) o).getStartPunt().equals(this.start) && ((LijnStuk) o).getEindPunt().equals(this.eind)) || 
					(((LijnStuk) o).getStartPunt().equals(this.eind) && ((LijnStuk) o).getEindPunt().equals(this.start))){
				return true;
			}
		}
		return false;
	}

}

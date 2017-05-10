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
	
	public Omhullende getOmhullende(){
		int x, y, breedte, hoogte;
		if(start.getX() <= eind.getX()){
			x = start.getX();
		}else{
			x = eind.getX();
		}

		if(start.getY() <= eind.getY()){
			y = start.getY();
		}else{
			y = eind.getY();
		}

		Punt linkerBovenhoek = new Punt(x, y);
		
		breedte = start.getX() - eind.getX();
		if(breedte < 0){
			breedte = -breedte;
		}

		hoogte = start.getY() - eind.getY();
		if(hoogte < 0){
			hoogte = -hoogte;
		}

		Omhullende o = new Omhullende(linkerBovenhoek, breedte, hoogte);
		
		return o;
	}
	
	@Override
	public String toString() {
		return "LijnStuk [start=" + start.toString() + ", eind=" + eind.toString() + "]" + super.toString();
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

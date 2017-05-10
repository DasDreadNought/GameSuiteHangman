package domain;

import domain.DomainException;
import domain.Punt;
public class Omhullende {
	
	private Punt linkerBovenhoek;
	private int breedte, hoogte;
	
	
	public Omhullende(Punt linkerBovenhoek , int breedte, int hoogte){
		setLinkerBovenhoek(linkerBovenhoek);
		setBreedte(breedte);
		setHoogte(hoogte);
	}


	public Punt getLinkerBovenhoek() {
		return linkerBovenhoek;
	}

	public void setLinkerBovenhoek(Punt linkerBovenhoek) {
		if(linkerBovenhoek == null ) throw new DomainException();
		
		this.linkerBovenhoek = linkerBovenhoek;
	}


	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		if(breedte < 0) {throw new DomainException();}
		this.breedte = breedte;
	}


	public int getHoogte() {
		return hoogte;
	}

	public boolean equals(Omhullende o){
		
		if(o != null && linkerBovenhoek.equals(o.getLinkerBovenhoek()) 
				&& breedte == o.getBreedte() 
				&& hoogte == o.getHoogte()){
			return true ;
		}
		return false;
	}

	public void setHoogte(int hoogte) {
		if(hoogte < 0) {throw new DomainException();}
		this.hoogte = hoogte;
	}
	
	public int getMaximumX(){
		return linkerBovenhoek.getX() + breedte;
	}
	
	public int getMaximumY(){
		return linkerBovenhoek.getY() + hoogte;
	}
	
	public int getMinimumX(){
		return linkerBovenhoek.getX();
	}
	
	public int getMinimumY(){
		return linkerBovenhoek.getY();
	}

	@Override
	public String toString() {
		return "Omhullende: " + linkerBovenhoek.toString() + ", " + breedte + ", " + hoogte + " ";
	}	
	
}
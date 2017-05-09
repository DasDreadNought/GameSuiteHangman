package domain;

public class Rechthoek {
	private int breedte, hoogte;
	private Punt linkerbovenhoek;
	public Rechthoek(Punt linkerboverhoek, int breedte, int hoogte){
		setBreedte(breedte); setHoogte(hoogte);setLinkerbovenhoek(linkerboverhoek);
	}
	
	//Settes
	
	

	public void setBreedte(int breedte) {
		if(breedte<=0){
			throw new DomainException("Breedte <= 0");
		}
		this.breedte = breedte;
	}
	public void setHoogte(int hoogte) {
		if(hoogte<=0){
			throw new DomainException("Hoogte <= 0");
		}
		this.hoogte = hoogte;
	}
	private void setLinkerbovenhoek(Punt punt){
		if(punt == null){
			throw new DomainException("Linkerbovenhoek is null");
		}
		this.linkerbovenhoek=punt;
	}
	
	//

	public int getBreedte() {
		return breedte;
	}
	
	public int getHoogte() {
		return hoogte;
	}
	public Punt getLinkerBovenhoek(){
		return linkerbovenhoek;
	}
	
	public boolean equals(Rechthoek rechthoek){
		return (rechthoek != null && rechthoek.getBreedte()==breedte &&  rechthoek.getHoogte()==hoogte && rechthoek.getLinkerBovenhoek().equals(linkerbovenhoek));
	}

	@Override
	public String toString() {
		return "Rechthoek: positie: "+linkerbovenhoek+" - breedte: "+breedte+ " - hoogte: "+hoogte;
	}
	
	
	
	
}

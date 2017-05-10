package domain;

public class Driehoek  extends Vorm{
	private Punt hoekPunt1;
	private Punt hoekPunt2;
	private Punt hoekPunt3;

	
	public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3){
		this.setHoekPunten(hoekPunt1, hoekPunt2, hoekPunt3);
	}
	public void setHoekPunten(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3){
		if(hoekPunt1==null || hoekPunt2==null || hoekPunt3==null){
			throw new DomainException();
		}
		else if(hoekPunt1==hoekPunt2 || hoekPunt2==hoekPunt3 || hoekPunt3==hoekPunt1){
			throw new DomainException();
		}
		else if((hoekPunt2.getX()-hoekPunt3.getY())*(hoekPunt3.getY()-hoekPunt1.getY()) ==
				((hoekPunt3.getX()-hoekPunt1.getY())*(hoekPunt2.getY()-hoekPunt1.getY()))){
			throw new DomainException();
		}
		this.hoekPunt1 = hoekPunt1;
		this.hoekPunt2 = hoekPunt2;
		this.hoekPunt3 = hoekPunt3;
	}
	public Punt getHoekPunt1(){
		return this.hoekPunt1;
		}
	public Punt getHoekPunt2(){
		return this.hoekPunt2;
		}
	public Punt getHoekPunt3(){
		return this.hoekPunt3;
		}
	public String toString(){
		return "Driehoek: hoekpunt1: " + this.getHoekPunt1().toString() +
				" - hoekpunt2: " + this.getHoekPunt2().toString() +
				" - hoekpunt3: " + this.getHoekPunt3().toString();
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Driehoek&&o!=null){
			if(((Driehoek) o).getHoekPunt1().equals(this.hoekPunt1) && ((Driehoek) o).getHoekPunt2().equals(this.hoekPunt2) && ((Driehoek) o).getHoekPunt3().equals(this.hoekPunt3)){
				return true;
			}
		}
		return false;
	}
}

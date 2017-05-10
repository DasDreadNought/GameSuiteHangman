package domain;
public class Cirkel  extends Vorm{
	private int radius;
	private Punt middelpunt;
	public Cirkel(Punt p, int r){
		setRadius(r);
		setMiddelpunt(p);
	}
	public void setMiddelpunt(Punt p) {
		if(p==null){
			throw new DomainException();
		}else{
			middelpunt= p;
		}
		
	}
	public Punt getMiddelpunt(){
		return middelpunt;
	}
	public void setRadius(int r) {
		if(r<=0){
			throw new DomainException();
		}else{
			radius= r;
		}
		
	}
	public int getRadius(){
		return radius;
	}
	public boolean equals(Object o){
		if(o!=null && o instanceof Cirkel ){
			if(((Cirkel) o).getMiddelpunt().equals(this.middelpunt) && ((Cirkel) o).getRadius()==this.radius){
				return true;
			}
		}
		return false;
	}
			
	public String toString(){

		return "Cirkel: middelPunt: "+middelpunt+" - staal: "+ radius;
	}
}
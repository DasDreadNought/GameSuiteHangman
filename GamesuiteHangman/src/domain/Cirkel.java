package domain;
public class Cirkel {
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
	public boolean equals(Cirkel c){
		if(c==null){
			throw new DomainException();
		}else if(c.getMiddelpunt()==this.middelpunt && c.getRadius()==this.radius){
			return true;
		}else{
			return false;
		}
			
	}
	public String toString(){
		return "Cirkel: middelPunt: ("+ middelpunt.getX() +", "+middelpunt.getY() +") - straal: "+ radius;
	}
}
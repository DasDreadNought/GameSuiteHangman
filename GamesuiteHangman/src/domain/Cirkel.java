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
			throw new NullPointerException();
		}else{
			middelpunt= p;
		}
		
	}
	public Punt getMiddelpunt(){
		return middelpunt;
	}
	public void setRadius(int r) {
		if(r<=0){
			throw new Exception();
		}else{
			radius= r;
		}
		
	}
	public int getRadius(){
		return radius;
	}
	public boolean equals(Cirkel c){
		if(c==null){
			throw new NullPointerException();
		}else if(c.getMiddelpunt().equals(middelpunt) && c.getRadius()==radius){
			return true;
		}else{
			return false;
		}
			
	}
	public String toString(){
		return "Cirkel: middelPunt: ("+ middelpunt.getX() +", "+middelpunt.getY() +") - staal: "+ radius;
	}
}
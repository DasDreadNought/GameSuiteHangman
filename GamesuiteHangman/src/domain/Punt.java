package domain;

public class Punt {

	private int x, y;

	public Punt(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}


	public boolean equals(Punt p) {
		if(p == null) return false;
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}

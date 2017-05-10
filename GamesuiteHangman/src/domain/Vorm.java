package domain;

public abstract class Vorm {
	
	public abstract boolean equals(Object o);
	public String toString(){
		return "\n" + this.getOmhullende().toString();
	}
	
	public abstract Omhullende getOmhullende();
}

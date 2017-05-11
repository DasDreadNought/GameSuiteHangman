package domain;

import java.awt.Graphics;

public abstract class Vorm implements Drawable{
	private boolean zichtbaar=true;
	public abstract boolean equals(Object o);
	public String toString(){
		return "\n" + this.getOmhullende().toString();
	}
	public abstract void teken(Graphics g);
	public abstract Omhullende getOmhullende();
	
	public boolean isZichtbaar(){
		return zichtbaar;
	}
	public void setZichtbaar(boolean zie){
		zichtbaar = zie;
	}
	
	
}

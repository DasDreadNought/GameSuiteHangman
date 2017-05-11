package domain;

import java.awt.Graphics;

public abstract class Vorm implements Drawable{
	
	public abstract boolean equals(Object o);
	public String toString(){
		return "\n" + this.getOmhullende().toString();
	}
	public abstract void teken(Graphics g);
	public abstract Omhullende getOmhullende();
}

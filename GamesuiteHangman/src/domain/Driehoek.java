package domain;

import java.awt.Graphics;
import java.lang.Math;

public class Driehoek extends Vorm implements Drawable{
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
	
	public Omhullende getOmhullende(){
		Punt linkerBovenhoek;
		int breedte, hoogte, minX, maxX, minY, maxY;
		minX = Math.min(hoekPunt1.getX(), Math.min(hoekPunt2.getX(), hoekPunt3.getX()));
		minY = Math.min(hoekPunt1.getY(), Math.min(hoekPunt2.getY(), hoekPunt3.getY()));
		maxX = Math.max(hoekPunt1.getX(), Math.max(hoekPunt2.getX(), hoekPunt3.getX()));
		maxY = Math.max(hoekPunt1.getY(), Math.max(hoekPunt2.getY(), hoekPunt3.getY()));
		
		linkerBovenhoek = new Punt(minX, minY);
		breedte = maxX - minX;
		hoogte = maxY - minY;
		
		Omhullende o = new Omhullende(linkerBovenhoek, breedte, hoogte);
		return o;
	}
	
	public String toString(){
		return "Driehoek: hoekpunt1: " + this.getHoekPunt1().toString() +
				" - hoekpunt2: " + this.getHoekPunt2().toString() +
				" - hoekpunt3: " + this.getHoekPunt3().toString()
				 + super.toString();
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
	public void teken(Graphics graphics){
		int[] xPoints = { this.getHoekPunt1().getX(), this.getHoekPunt2().getX(),
				this.getHoekPunt3().getX() };
		int[] yPoints = { this.getHoekPunt1().getY(), this.getHoekPunt2().getY(),
				this.getHoekPunt3().getY() };
		graphics.drawPolygon(xPoints, yPoints, 3);
	}
}

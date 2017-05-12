package db;

import java.util.Scanner;

import domain.WoordenLijst;

public class WoordenLezer {
	private String bestandsNaam;
	private Scanner s;

	public WoordenLezer(String bestandsNaam) {
		this.bestandsNaam = bestandsNaam;
		s = new Scanner("bestandsNaam");
	}

	public WoordenLijst lees() {
		WoordenLijst wl = new WoordenLijst();
		while(s.hasNextLine()){
		wl.voegToe((s.nextLine()));
		}
		return wl;
	}
	public String getBestandsNaam(String bestandsNaam){
		return bestandsNaam;
	}
	

}

package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.WoordenLijst;

public class WoordenLezer {
	private String bestandsNaam;
	private Scanner s;
	File file;

	public WoordenLezer(String bestandsNaam) {
		file= new File(bestandsNaam);
		this.bestandsNaam = bestandsNaam;
		
	}

	public WoordenLijst lees() {
		WoordenLijst wl = new WoordenLijst();
		try {
			s = new Scanner(file);
			
			while(s.hasNextLine()){
				String nextline = s.nextLine();
				wl.voegToe(nextline);
				}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return wl;
	}
	public String getBestandsNaam(String bestandsNaam){
		return bestandsNaam;
	}
	

}

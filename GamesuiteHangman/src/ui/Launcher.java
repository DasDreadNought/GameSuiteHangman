package ui;

import javax.swing.JOptionPane;

import db.WoordenLezer;
import domain.Speler;
import domain.WoordenLijst;

public class Launcher {

	public static void main(String[] args) {
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);
		Object[] spel ={"hangman","tekenen",};
		String keuze = (String) JOptionPane.showInputDialog(null, "Wat wilt u spelen", "input", JOptionPane.INFORMATION_MESSAGE, null, spel, null);
		switch(keuze){
		case "hangman":
			WoordenLezer wlz = new WoordenLezer("Hangman.txt");
			WoordenLijst wls = wlz.lees();
			HangManUi hangman= new HangManUi(speler, wls);
			break;
		case "tekenen":
			JOptionPane.showMessageDialog(null, speler.getNaam()+" zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
			PictionaryUi picUi = new PictionaryUi(speler);
			break;

		}
	}
}

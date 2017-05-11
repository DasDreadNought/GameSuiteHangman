package ui;

import javax.swing.JOptionPane;

import domain.Speler;
import domain.WoordenLijst;
import db.WoordenLezer;

public class Launcher {

	public static void main(String[] args) {
		WoordenLezer wlz = new WoordenLezer("Hangman.txt");
		WoordenLijst wls = new WoordenLijst();
		JOptionPane.showMessageDialog(null,"Dit zijn alle woorden: " + wlz.lees());
		String naam = JOptionPane.showInputDialog("Welkom! \nHoe heet je?");
		Speler speler = new Speler(naam);
		JOptionPane.showMessageDialog(null, speler.getNaam()+" zal binnekort spelen", speler.getNaam(), JOptionPane.INFORMATION_MESSAGE);
		PictionaryUi picUi = new PictionaryUi(speler);
		
	}


}

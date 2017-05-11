package ui;

import javax.swing.JOptionPane;

import domain.Speler;
import domain.Tekening;

public class PictionaryUi {
	private Speler speler;
	private Tekening tekening;
	private Ui ui;
	
	public PictionaryUi( Speler speler){
		this.tekening = new Tekening(JOptionPane.showInputDialog("Geef de Naam van je tekening:"));
		ui = new Ui(speler,this.tekening);
		input();
		
	}
	
	private void input(){
		StringBuilder out = new StringBuilder();
		out.append("Wat wil je doen:\n\n1. Vorm maken\n2.Tekening tonen\n\n0. Stoppen");
		boolean loop = true;
		while(loop){
			String antwoord = JOptionPane.showInputDialog(out.toString()).toLowerCase();
			switch(antwoord){
			case "1":
			case "vorm maken":
				ui.createVorm();
				break;
			case "2":
			case "tekening tonen":
				ui.toonVorm();
				break;
			case "0":
				loop=false;
				break;
			default:
				JOptionPane.showConfirmDialog(null, "Geef een van de gegeven opties!");
			}
		}
	}
}

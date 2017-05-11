package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.Driehoek;
import domain.LijnStuk;
import domain.Punt;
import domain.Rechthoek;
import domain.Speler;
import domain.Tekening;
import domain.Vorm;

public class Ui {
	Speler speler;
	Tekening tekening;
	
	public Ui (Speler speler, Tekening tekening){
		this.speler= speler;
		this.tekening = tekening;
	}
	public void createVorm(){


		Object[] shapes ={"Cirkel","Rechthoek","Driehoek","Lijnstuk"};
		String keuze = (String) JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
		Vorm o = null;
		String vorm = "";
		switch(keuze){
		case "Cirkel":
			try {
				Punt punt= createPunt();
				int radius = Integer.parseInt(JOptionPane.showInputDialog("Wat is de radius"));
				 o= new Cirkel(punt,radius);
				 vorm="cirkel";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case "Rechthoek":
			try {
				Punt punt= createPunt();
				int breedte = Integer.parseInt(JOptionPane.showInputDialog(" breedte van de rechthoek : "));
				int hoogte = Integer.parseInt(JOptionPane.showInputDialog(" hoogte van de rechthoek : "));
				o= new Rechthoek(punt,breedte, hoogte);
				vorm="rechthoek";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case "Driehoek":
			try {
				Punt punt1= createPunt();
				Punt punt2= createPunt();
				Punt punt3= createPunt();
				o= new Driehoek(punt1,punt2, punt3);
				vorm="driehoek";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case "Lijnstuk":
			try {
				Punt punt1= createPunt();
				Punt punt2= createPunt();
				o= new LijnStuk(punt1,punt2);
				vorm="lijnstuk";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		}
		
		JOptionPane.showMessageDialog(null, "U heeft een correcte "+vorm+" aangemaakt: " + o.toString());
		if(o!=null){
			tekening.voegToe(o);
		}
	}
	public void toonVorm(){
		GameMainWindow view = new GameMainWindow(this.speler.getNaam(), this.tekening);
		view.setVisible(true);
		view.teken();
	}
	public Punt createPunt(){
		String x = JOptionPane.showInputDialog(" x coordinaat van het punt : ");
		String y = JOptionPane.showInputDialog(" y coordinaat van het punt : ");
		int newX = Integer.parseInt(x);
		int newY = Integer.parseInt(y);
		Punt punt =new Punt(newX, newY);
		JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt.toString());
		return punt;
	}
}

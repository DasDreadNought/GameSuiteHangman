package ui;

import javax.swing.JOptionPane;

import domain.Cirkel;
import domain.Punt;
import domain.Rechthoek;

public class Ui {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog(" x coordinaat van het punt : ");
		String y = JOptionPane.showInputDialog(" y coordinaat van het punt : ");
		int newX = Integer.parseInt(x);
		int newY = Integer.parseInt(y);
		Punt punt = new Punt(newX, newY);
		JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt.toString());
		Object[] shapes ={"Cirkel","Rechthoek"};
		String keuze = (String) JOptionPane.showInputDialog(null, "Wat wilt u tekenen", "input", JOptionPane.INFORMATION_MESSAGE, null, shapes, null);
		Object o = null;
		String vorm = "";
		switch(keuze){
		case "Cirkel":
			try {
				int radius = Integer.parseInt(JOptionPane.showInputDialog("Wat is de raduis"));
				 o= new Cirkel(punt,radius);
				 vorm="cirkel";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case "Rechthoek":
			try {
				int breedte = Integer.parseInt(JOptionPane.showInputDialog(" breedte van de rechthoek : "));
				int hoogte = Integer.parseInt(JOptionPane.showInputDialog(" hoogte van de rechthoek : "));
				o= new Rechthoek(punt,breedte, hoogte);
				vorm="rechthoek";
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		}
		JOptionPane.showMessageDialog(null, "U heeft een correct "+vorm+" aangemaakt: " + o.toString());
	}
}

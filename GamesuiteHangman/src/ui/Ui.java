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
		switch(keuze){
		case "Cirkel":
			try {
				String middelpuntX = JOptionPane.showInputDialog(" x coordinaat van het middelpunt : ");
				String middelpuntY = JOptionPane.showInputDialog(" y coordinaat van het middlepunt : ");
				
				Punt puntCirkel = null;
				int radius = Integer.parseInt(JOptionPane.showInputDialog("Wat is de raduis"));
				 puntCirkel = new Punt(Integer.parseInt(middelpuntX), Integer.parseInt(middelpuntY));
				 o= new Cirkel(puntCirkel,radius);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case "Rechthoek":
			try {
				int hoekpuntX = Integer.parseInt(JOptionPane.showInputDialog(" x coordinaat van de linkerbovenhoek : "));
				int hoekpuntY = Integer.parseInt(JOptionPane.showInputDialog(" y coordinaat van de linkerbovenhoek : "));
				int breedte = Integer.parseInt(JOptionPane.showInputDialog(" breedte van de rechthoek : "));
				int hoogte = Integer.parseInt(JOptionPane.showInputDialog(" hoogte van de rechthoek : "));
				o= new Rechthoek(new Punt(hoekpuntX,hoekpuntY),breedte, hoogte);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		System.out.println(o.toString());
	}
}

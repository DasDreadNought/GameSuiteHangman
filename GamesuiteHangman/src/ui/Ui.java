package ui;

import javax.swing.JOptionPane;

import domain.Punt;

public class Ui {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog(" x coordinaat van het punt : ");
		String y = JOptionPane.showInputDialog(" y coordinaat van het punt : ");
		int newX = Integer.parseInt(x);
		int newY = Integer.parseInt(y);
		Punt punt = new Punt(newX, newY);
		JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + punt.toString());

	}
}

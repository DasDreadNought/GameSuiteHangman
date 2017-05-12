package ui;
import domain.HangMan;
import domain.Speler;
import domain.Tekening;
import domain.TekeningHangman;
import domain.WoordenLijst;

public class HangManUi {
	Speler speler;
	WoordenLijst woorden;
	TekeningHangman teken = new TekeningHangman();
	public HangManUi(Speler s, WoordenLijst woorden){
		speler=s;
		this.woorden=woorden;
		play();
	}
	public void play(){
		HangMan hangman = new HangMan(speler, woorden);
		HangManHoofdScherm game = new HangManHoofdScherm(hangman, new HangmanPaneel(hangman));
		game.setVisible(true);
		game.teken();
	}
}

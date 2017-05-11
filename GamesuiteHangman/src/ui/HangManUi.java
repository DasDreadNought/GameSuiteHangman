package ui;
import domain.Speler;
import domain.Tekening;
import domain.TekeningHangman;

public class HangManUi {
	Speler speler;
	TekeningHangman teken = new TekeningHangman();
	public HangManUi(Speler s){
		speler=s;
		play();
	}
	public void play(){
		GameMainWindow game = new GameMainWindow("Hangman", teken);
		game.setVisible(true);
		game.teken();
	}
}

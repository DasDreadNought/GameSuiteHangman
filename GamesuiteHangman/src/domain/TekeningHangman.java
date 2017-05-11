package domain;

import java.awt.Graphics;

public class TekeningHangman extends Tekening{

	public TekeningHangman() {
		super("Hangman");
		Vorm galgBodem = new Rechthoek(new Punt(10, 350), 300, 40);// altijd zichtbaar
		super.voegToe(galgBodem);
		Vorm galgStaaf = new LijnStuk(new Punt(160, 350), new Punt(160, 50));// altijd zichtbaar
		super.voegToe(galgStaaf);
		Vorm hangbar = new LijnStuk(new Punt(160, 50), new Punt(280, 50));// altijd zichtbaar
		super.voegToe(hangbar);
		Vorm koord = new LijnStuk(new Punt(280, 50), new Punt(280, 100));// altijd zichtbaar
		super.voegToe(koord);
		Vorm hoofd = new Cirkel(new Punt(280, 125), 25);// zichtbaar na 1 fout
		super.voegToe(hoofd);
		Vorm oogLinks = new Cirkel(new Punt(270, 118), 2);// zichtbaar na 2 fouten
		super.voegToe(oogLinks);
		Vorm oogRechts = new Cirkel(new Punt(290, 118), 2);//…
		super.voegToe(oogRechts);
		Vorm neus = new Cirkel(new Punt(280, 128), 2);
		super.voegToe(neus);
		Vorm mond = new LijnStuk(new Punt(270, 138), new Punt(290, 138));
		super.voegToe(mond);
		Vorm lijf = new LijnStuk(new Punt(280, 150), new Punt(280, 250));
		super.voegToe(lijf);
		Vorm beenLinks = new LijnStuk(new Punt(280, 250), new Punt(240, 310));
		super.voegToe(beenLinks);
		Vorm beenRechts = new LijnStuk(new Punt(280, 250), new Punt(320, 310));
		super.voegToe(beenRechts);
		Vorm voetLinks = new Cirkel(new Punt(240, 310), 5);
		super.voegToe(voetLinks);
		Vorm voetRechts = new Cirkel(new Punt(320, 310), 5);
		super.voegToe(voetRechts);
		Vorm armLinks = new LijnStuk(new Punt(280, 200), new Punt(230, 170));
		super.voegToe(armLinks);
		Vorm armRechts = new LijnStuk(new Punt(280, 200), new Punt(330, 170));
		super.voegToe(armRechts);
		Vorm handLinks = new Cirkel(new Punt(230, 170), 5);
		super.voegToe(handLinks);
		Vorm handRechts = new Cirkel(new Punt(330, 170), 5);
		super.voegToe(handRechts);
		reset();
	}
	
	public String getNaam(){
		return super.getNaam();
	}
	
	public int getAantalOnzichtbaar(){
		int temp=0;
		for(int i =super.getAantalVormen()-1;i>=0;i--){
			if(!super.getVorm(i).isZichtbaar()){
				temp++;
			}
		}
		return temp;
	}
	
	public void zetVolgendeZichtbaar(){
		if(getAantalOnzichtbaar()==0){
			throw new IllegalArgumentException("Geen onzichtbare delen meer!");
		}
		super.getVorm(super.getAantalVormen()-getAantalOnzichtbaar()).setZichtbaar(true);;
	}
	
	public void reset(){
		for(int i = 4; i<super.getAantalVormen();i++){
			if(super.getVorm(i).isZichtbaar()) super.getVorm(i).setZichtbaar(false);
		}
	}
	
	public void teken(Graphics g){
		super.teken(g);
	}
	@Override
	public void verwijder(Vorm v){
		throw new IllegalStateException("tekening mag niet aangepast worden");
	}
	@Override
	public void voegToe(Vorm v){
		throw new IllegalStateException("tekening mag niet aangepast worden");
	}
}

package domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TekeningHangManTest {
	private Speler geldigeSpeler;
	private TekeningHangman test;
	private Cirkel c=new Cirkel(new Punt(10,20), 5);
	@Before
	public void setup(){
		geldigeSpeler=new Speler("x");
		test= new TekeningHangman();
	}
	@Test
	public void TekeningHangManConstructor_moet_tekening_aanmaken_waarvan_14_onzichtbaar(){
		assertEquals(14,test.getAantalOnzichtbaar());
	}
	@Test
	public void ZetVolgendeZichtbaar_moet_eerstvolgende_onzichtbare_vorm_zichtbaar_maken(){
		test.zetVolgendeZichtbaar();
		assertEquals(13,test.getAantalOnzichtbaar());
	}
	@Test (expected = IllegalArgumentException.class)
	public void ZetVolgendeZichtbaar_gooit_exception_wanneer_alles_zichtbaar(){
		while(test.getAantalOnzichtbaar()>=0){
			test.zetVolgendeZichtbaar();
		}
	}
	@Test 
	public void reset_maakt_alles_onzichtbaar_behalve_galg(){
		while(test.getAantalOnzichtbaar()>0){
			test.zetVolgendeZichtbaar();
		}
		test.reset();
		assertEquals(14,test.getAantalOnzichtbaar());
	}
	@Test (expected = IllegalStateException.class)
	public void voegToe_gooit_exception(){
		test.voegToe(c);
	}
	@Test (expected = IllegalStateException.class)
	public void verwijder_gooit_exception(){
		test.verwijder(c);
	}
}

package domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CirkelTest {
	
	Punt p1= new Punt(10,20);
	Punt p2= new Punt(20,30);
	int r1= 5;
	int r2= 0;
	int r3= -1;
	int r4= 10;
	
	
	
	@Test
	public void Maak_Cirkel(){
		Cirkel cirkel= new Cirkel(p1, r1);
		
		assertEquals(p1, cirkel.getMiddelpunt());
		assertEquals(r1, cirkel.getRadius());
	}
	@Test (expected = DomainException.class)
	public void Cirkel_Moet_exception_gooien_als_Middelpunt_null()  {
		new Cirkel(null, r1);
	}
	@Test (expected = DomainException.class)
	public void Cirkel_Moet_exception_gooien_als_radius_kleiner_dan_0()  {
		new Cirkel(p1, r3);
	}
	@Test (expected = DomainException.class)
	public void Cirkel_Moet_exception_gooien_als_radius_0()  {
		new Cirkel(p1, r2);
	}
	@Test
	public void Cirkel_Gelijk()  {
		Cirkel cirkel1 = new Cirkel(p1, r1);
		Cirkel cirkel2 = new Cirkel(p1, r1);
		assertTrue(cirkel1.equals(cirkel2));
			
		
		
	}
	@Test
	public void Cirkel_Niet_Gelijk_bij_null()  {
		assertFalse(new Cirkel(p1, r1).equals(null));
	}
	@Test
	public void Cirkel_Niet_Gelijk_bij_ander_middelpunt()  {
		assertFalse(new Cirkel(p1, r1).equals(new Cirkel(p2, r1)));
	}
	@Test
	public void Cirkel_Niet_Gelijk_bij_andere_radius()  {
		assertFalse(new Cirkel(p1, r1).equals(new Cirkel(p1, r4)));
	}
}

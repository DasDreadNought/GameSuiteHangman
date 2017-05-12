package domain;

import java.util.ArrayList;
import java.util.Random;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class WoordenLijst {
	ArrayList<String> lijst;
	Random randomGen;

	public WoordenLijst() {
		lijst = new ArrayList<>();
		randomGen = new Random();
	}

	public int getAantalWoorden() {
		return lijst.size();
	}

	public void voegToe(String woord) {
		if (woord == null || woord.trim().isEmpty()) {
			throw new DomainException();
		}
		for (String w : lijst) {
			if (w == woord) {
				throw new DomainException();
			}
		}
		lijst.add(woord);
	}

	public String getRandomWoord() {
		if (lijst.size() == 0)
			return null;
		if (lijst.size() == 1)
			return lijst.get(0);
		int index = randomGen.nextInt(lijst.size());
		return lijst.get(index);
	}

}

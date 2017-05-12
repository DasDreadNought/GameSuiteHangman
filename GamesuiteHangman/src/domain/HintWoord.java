package domain;

import java.util.ArrayList;

public class HintWoord {
	
	private String woord;
	public boolean geraden;
	private ArrayList <HintLetter> hintLetters = new ArrayList();
	
	public HintWoord(String woord){
		System.out.println(woord);
		setWoord(woord);
		char[] hulp = woord.toCharArray();
		for(int i = 0; i < hulp.length; i++){
			hintLetters.add(new HintLetter(hulp[i]));
		}
	}
	
	public void setWoord(String woord){
		if(woord == null || woord.trim().equals("")){
			throw new DomainException();
		}
		this.woord = woord;
	}
	
	public boolean raad(char x){
		boolean result = false;
		for(HintLetter e: hintLetters){
			if (e.raad(x)){
				result = true;
			}
		}
		
		return result;
	}
	
	public String getWoord(){
		return this.woord;
	}
	
	public boolean isGeraden(){
		geraden = true;
		
		for (HintLetter e: hintLetters){
			if(!e.isGeraden()){
				geraden = false;
			}
		}
		return geraden;
	}
	
	public String toString(){
		String result = "";
		
		for (HintLetter e: hintLetters){
			if(e.geraden){
				result += e.toChar() + " ";
			} else {
				result += "_ ";
			}
		}
		
		return result.substring(0, result.length() - 1);
	}

}

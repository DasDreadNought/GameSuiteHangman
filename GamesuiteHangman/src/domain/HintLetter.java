package domain;

public class HintLetter {
	
	private char letter;
	public boolean geraden;
	
	public HintLetter(char letter){
		this.letter = letter;
	}

	public char getLetter() {
		return letter;
	}
	
	public boolean raad(char letter){
		if (geraden){
			return false;
		}
		geraden = (Character.toLowerCase(letter) == Character.toLowerCase(this.letter));
		return geraden;
	}
	
	public boolean isGeraden(){
		return geraden;
	}
	
	public char toChar(){
		if (isGeraden()){
			return letter;
		}
		return '_';
	}

	

}

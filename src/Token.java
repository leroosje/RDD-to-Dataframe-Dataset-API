
public class Token {

	private String value;
	private int charLocation;
	
	public Token(String val) {
		this.value = val;
		charLocation = 0;
	}
	
	public char getChar(int i) {
		return value.charAt(i);
	}
	
	public void nextChar() {
		charLocation++;
		if(charLocation == value.length()) {
			charLocation--;
		}
	}
	
	public void prevChar() {
		charLocation--;
		if(charLocation == -1) {
			charLocation++;
		}
	}
	
	public String getVal() {
		return this.value;
	}
}


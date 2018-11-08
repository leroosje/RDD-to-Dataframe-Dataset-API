/*
 * VERSION 1
 * 
 * Created naively; going to restructure, so it runs through this grammar as the input stream is read in.
 * As such, this class will create Pairs as the stream is read, rather than after tokens are already discovered
 * 
 */
public class TokenGrammar {
	
	public TokenGrammar() {
		
	}
	
	//Returns token name as specified in the grammar
	public String getTokenName(Token t) {
		String name = "<none>";
		
		if(isNumber(t)) {
			name = "<number>";
		}
		else if(isIdentifier(t)) {
			name = "<identifier>";
		}
		else if(isString(t)) {
			name = "<string>";
		}
		else if(isSymbol(t)) {
			name = "<symbol>";
		}
		
		return name;
	}
	
	//Helper to determine if a char is a letter
	public boolean letter(char c) {
		if(c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' ||
		   c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' ||
		   c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' ||
		   c == 'y' || c == 'z' ||
		   c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' ||
		   c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' ||
		   c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' ||
		   c == 'Y' || c == 'Z' || c == '_') {
			return true;
		}
		return false;
	}
	
	//Helper to determine if the char is a digit
	public boolean digit(char c) {
		if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || 
		   c == '8' || c == '9') {
			return true;
		}
		return false;
	}
	
	public boolean isNumber(Token t) {
		int i = 0; 
		
		//Checks to see if there is at least one char in the token
		if(digit(t.getChar(i))) {
			i++;
			
			//iterates through the token's chars until it runs into a char that isnt a digit, or end of string
			while(digit(t.getChar(i)) && i < t.getVal().length()) {
				i++;
			}
		}
		
		//If it made it to the end of the string, return true.
		if(i == t.getVal().length()) {
			return true;
		}
		
		
		return false;
	}
	
	public boolean isIdentifier(Token t) {
		int i = 0;
		
		//Checks to see if there is at least one letter at the start
		if(letter(t.getChar(i))) {
			i++;
			
			//Iterates through the rest of the tokens value, checking for digit || letter, until the end of the string
			while((letter(t.getChar(i)) || digit(t.getChar(i))) && i < t.getVal().length()) {
				i++;
			}
			
		}

		//If it made it to the end of the string, return true.
		if(i == t.getVal().length()) {
			return true;
		}
		
		return false;
	}
	
	public boolean isString(Token t) {
		
		//Checks if the first char is "
		if(t.getChar(0) == '"') {
			
			//Checks if the last char is "
			if(t.getChar(t.getVal().length() - 1) == '"') {
				return true;
			}
			
		}
		return false;
	}
	
	public boolean isChar(Token t) {
		
		//Any char token is guarenteed length 3, 'x'
		if(t.getVal().length() == 3) {
			
			//Checks if the first char is an '. The ascii value of ' is 39
			if(t.getChar(0) == 39) {
				
				//Checks if the last char is an '
				if(t.getChar(2) == 39) {
					return true;
				}
					
			}
		}
		return false;
	}
	
	public boolean isSymbol(Token t) {
		
		//Checks for length 1
		if(t.getVal().length() == 1) {
			
			//If its anything thats not something above, and not a space, its a symbol.
			if(t.getChar(0) != ' ') {
				return true;
			}
		}
		
		return false;
	}
}
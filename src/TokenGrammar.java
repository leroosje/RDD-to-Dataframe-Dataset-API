/*
 * VERSION 2
 * 
 * Adjusted to be within the context of prebuilt software. Now takes strings and returns their token name.
 *
 * 
 */
public class TokenGrammar {

	public TokenGrammar() {

	}

	/**
	 * isSpace method was produced by Danny Reinheimer under Dr.
	 * Xipeng Shen, and was used with permission of Dr. Xipeng Shen.
	 * 
	 * 
	 * isMetaStatement was originally produced by Danny Reinheimer but edited to fit the context of the program.
	 * 
	 * @author Danny Reinheimer @
	 */
	public boolean isSpace(String str) {
		System.out.println("isSpace");
		char ch = str.charAt(0);
		// if(ch == ' ') {
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch != ' ' && ch != '\n' && ch != '\r' && ch != '\u001a' && ch != '\t') {
				// this is not space
				return false;
			}
		}
			System.out.println("Im true");
		return true;
		// }
		// return false;
	}


	// Helper to determine if a char is a letter
	public boolean letter(char c) {
		if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
				|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
				|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
				|| c == 'z' || c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G'
				|| c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O'
				|| c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W'
				|| c == 'X' || c == 'Y' || c == 'Z' || c == '_') {
			return true;
		}
		return false;
	}

	// Helper to determine if the char is a digit
	public boolean digit(char c) {
		if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9') {
			return true;
		}
		return false;
	}

	public boolean isNumber(String s) {
		int i = 0;
		System.out.println("isNumber");
		// Checks to see if there is at least one char in the token
		if (digit(s.charAt(i))) {
			i++;

			// iterates through the token's chars until it runs into a char that isnt a
			// digit, or end of string
			while (i < s.length() && digit(s.charAt(i))) {
				i++;
			}
		}

		// If it made it to the end of the string, return true.
		if (i == s.length()) {
			System.out.println("Im true");
			return true;
		}

		return false;
	}

	public boolean isIdentifier(String s) {
		int i = 0;
		System.out.println("isIdentifier");
		// Checks to see if there is at least one letter at the start
		if (letter(s.charAt(i)) && s.length() > 1) {
			i++;

			// Iterates through the rest of the tokens value, checking for digit || letter,
			// until the end of the string
			while (i < s.length() && (letter(s.charAt(i)) || digit(s.charAt(i)))) {
				i++;
			}

		}

		// If it made it to the end of the string, return true.
		if (i == s.length()) {
			System.out.println("Im true");
			return true;
		}

		return false;
	}

	public boolean isString(String s) {
		System.out.println("isString");
		// Checks if the first char is "
		if (s.charAt(0) == '"') {

			// Checks if the last char is "
			if (s.charAt(s.length() - 1) == '"') {	
				System.out.println("Im true");
				return true;
			}

		}
		return false;
	}

	public boolean isCharacter(String s) {
		System.out.println("isChar");
		// Any char token is guarenteed length 3, 'x'
		if (s.length() == 3) {

			// Checks if the first char is an '. The ascii value of ' is 39
			if (s.charAt(0) == 39) {

				// Checks if the last char is an '
				if (s.charAt(2) == 39) {
					System.out.println("Im true");
					return true;
				}

			}
		}
		return false;
	}

	private String [] symbols = {"(",")","{","}","[","]",",",";","+","-","*","/","==","!=",">",">=","<","<=",
			"=","&&","||",".","%"};
	public boolean isSymbol(String s) {
		// Iterate through the list of symbols to see if the string equals any of them
		for(String symbol: symbols) {
			if(s.equals(symbol)) {
				// This is a symbol
				return true;
			}
		}
		// if no matches then not a symbol
		return false;
	}
	
}

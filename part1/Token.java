/**
 * This is the token class used to check the input against the RE and identify the correct token
 */

/**
 * @author Danny Reinheimer
 * This class was mostly written under and used with permission of Dr. Xipeng Shen
 * 
 * Edits have been made to it in order to fit the project.
 */



public class Token {
	
	private TokenGrammar tg;
	
	public Token() {
		this.tg = new TokenGrammar();
	}
	
	/**
	 * Takes in the parsed input and checks it against all the regular expressions with priority
	 * @param str the input string to test
	 * @return the name of the token
	 */
	public TokenNames getToken(String str) {
			
		if(tg.isIdentifier(str)) {
			return TokenNames.Identifier;
		}
		
		if(tg.isNumber(str)) {
			return TokenNames.Number;
		}
		
		if(tg.isString(str)) {
			return TokenNames.String;
		}

		if(tg.isSpace(str)) {
			return TokenNames.Space;
		}

		if(tg.isSymbol(str)) {
			return TokenNames.Symbol;
		}
		

		return TokenNames.None;
	}

}

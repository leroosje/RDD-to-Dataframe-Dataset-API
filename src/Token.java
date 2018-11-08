/**
 * This is the token class used to check the input against the RE and identify the correct token
 */

/**
 * @author Danny Reinheimer
 *
 */
public class Token {
	
	private TokenGrammar tg;
	
	public Token() {
		this.tg = new TokenGrammar();
	}
	
	/**
	 * Takes in the parsed input and checks it againts all the regular expressions with priority
	 * @param str the input string to test
	 * @return the name of the token
	 */
	public TokenNames getToken(String str) {
				
		// First check to see if it is meta statement
		if(tg.isMetaStatement(str)) {
			return TokenNames.MetaStatements;
		}

		if(tg.isIdentifier(str)) {
			return TokenNames.Identifier;
		}
		
		if(tg.isNumber(str)) {
			return TokenNames.Number;
		}
		
		if(tg.isString(str)) {
			return TokenNames.String;
		}
		if(tg.isSymbol(str)) {
			return TokenNames.Symbol;
		}

		return TokenNames.None;
	}

}

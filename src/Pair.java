
public class Pair {

	private String tokenName;
	
	private Token token;
	
	public Pair(String name, Token t) {
		this.tokenName = name;
		this.token = t;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("(");
		s.append(tokenName);
		s.append(", ");
		s.append(token.getVal());
		s.append(") ");
		
		return s.toString();
	}
}

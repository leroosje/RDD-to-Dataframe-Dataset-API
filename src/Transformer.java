import java.io.*;

public class Transformer {

	public Transformer() {
	}

	public String transform(String s) {
		StringBuilder sb = new StringBuilder();
		
			if(s.equals("sc")){
				System.out.println("save me");
				
				sb.append("spark");

				s = sb.toString();
			}			
		
			if(s.equals("textFile")){

				sb.append("read.textFile");

				s = sb.toString();
			}
	
			if(s.equals("reduce")){
				sb.append("select(reduceAggregator(");
				sb.append(").collect()");
				s = sb.toString();
			}

			if(s.equals("reduceByKey")){
				
				sb.append("groupByKey(_._1).agg(reduceByKeyAggregator(");
				sb.append(")");
				s = sb.toString();
			}

			if(s.equals("sortBy")){
				sb.append("map(row=>((");
				sb.append("(row), row)).orderBy(_1).map(_._2)");
				s= sb.toString();
			}
		return s;
		
	}

	/*private static int findEndParenthesis(int i) {

		int balance = 1;

		while (balance != 0 && i < file.length()) {
			i++;
			if (file.charAt(i) == '(') {
				balance++;
			}
			if (file.charAt(i) == ')') {
				balance--;
			}
		}
		return i;
	}*/
}

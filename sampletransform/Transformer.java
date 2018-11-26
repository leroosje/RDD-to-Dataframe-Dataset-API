import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Transformer {
	
	private static FileInputStream fileInput;
	private static String file;

	public static void main(String args[]) {
		try {

			String programName = args[0];
			fileInput = new FileInputStream(programName);
			file = fileInput.toString();
		} catch (Exception e) {
			System.err.println("Invalid file!");
			System.exit(1);
		}
		
		try {
			PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
			
			writer.print(file);
			
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	public void transform() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < file.length(); i++) {
			if(file.substring(i, i+1).equals("sc")){
				sb.append(file.substring(0,i-1));
				sb.append("spark");
				sb.append(file.substring(i+2,file.length()-1));
				file = sb.toString();
			}
		}
		
		for(int i = 0; i < file.length(); i++) {
			if(file.substring(i, i+7).equals("textFile")){
				sb.append(file.substring(0,i-1));
				sb.append("read.textFile");
				sb.append(file.substring(i+8,file.length()-1));
				file = sb.toString();
			}
		}
		
		for(int i = 0; i < file.length(); i++) {
			if(file.substring(i, i+6).equals("reduce(")){
				sb.append(file.substring(0,i-1));
				sb.append("select(reduceAggregator(");
				int finalInd = findEndParenthesis(i+6);
				sb.append(file.substring(i+7,finalInd));
				sb.append(").collect()");
				sb.append(file.substring(finalInd+1,file.length()-1));
				file = sb.toString();
			}
		}
		
		for(int i = 0; i < file.length(); i++) {
			if(file.substring(i, i+11).equals("reduceByKey(")){
				sb.append(file.substring(0,i-1));
				sb.append("groupByKey(_._1).agg(reduceByKeyAggregator(");
				int finalInd = findEndParenthesis(i+11);
				sb.append(file.substring(i+12,finalInd));
				sb.append(")");
				sb.append(file.substring(finalInd+1,file.length()-1));
				file = sb.toString();
			}
		}
		
		for(int i = 0; i < file.length(); i++) {
			if(file.substring(i, i+6).equals("sortBy(")){
				sb.append(file.substring(0,i-1));
				sb.append("map(row=>((");
				int finalInd = findEndParenthesis(i+6);
				sb.append(file.substring(i+6,finalInd));
				sb.append("(row), row)).orderBy(_1).map(_._2)");
				sb.append(file.substring(finalInd+1,file.length()-1));
				file = sb.toString();
			}
		}
		
		
	}
	
	private int findEndParenthesis(int i) {
		
		int balance = 1;
		
		while(balance != 0) {
			i++;
			if(file.charAt(i) == '(') {
				balance++;
			}
			if(file.charAt(i) == ')') {
				balance--;
			}
		}
		return i;
	}
}

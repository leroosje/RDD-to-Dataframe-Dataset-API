import java.io.FileInputStream;

public class Transformer {
	
	private FileInputStream fileInput;
	private String file;

	public void read() {
		String programName = "";
		try {

			// file = new File(programName);
			fileInput = new FileInputStream(programName);
			file = fileInput.toString();
		} catch (Exception e) {
			System.err.println("Invalid file!");
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
				sb.append(")).collect()");
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

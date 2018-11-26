import java.io.*;

public class Transformer {
	
	private static FileInputStream fileInput;
	private static String file;

	public static void main(String args[]) {
		try {
			file = "";
			String programName = args[0];
			FileReader fr = new FileReader(programName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null){
				file += line;
			}
			br.close();
		} catch (Exception e) {
			System.err.println("Invalid file!");
			System.exit(1);
		}
		
		try {
			PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
			transform();
			writer.print(file);
			
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("fucked");
			System.exit(1);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.err.println("also fucked");
			System.exit(1);
		}
		
	}
	
	public static void transform() {
		System.out.println("IM HEREEE");
		System.out.println(file);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < file.length()-1; i++) {
			System.out.println(file.substring(i,i+2));
			if(file.substring(i, i+2).equals("sc")){
				System.out.println("save me");
				sb.append(file.substring(0,i));
				sb.append("spark");
				sb.append(file.substring(i+2,file.length()));
				i += 2;
				file = sb.toString();
			}			
		}
		System.out.println(file);
		sb = new StringBuilder();
		for(int i = 0; i < file.length()-7; i++) {
			if(file.substring(i, i+8).equals("textFile")){
				sb.append(file.substring(0,i));
				sb.append("read.textFile");
				sb.append(file.substring(i+8,file.length()));
				i+=8;
				file = sb.toString();
			}
		}
		sb = new StringBuilder();
		for(int i = 0; i < file.length()-6; i++) {
			if(file.substring(i, i+7).equals("reduce(")){
				sb.append(file.substring(0,i));
				sb.append("select(reduceAggregator(");
				int finalInd = findEndParenthesis(i+6);
				sb.append(file.substring(i+7,finalInd+1));
				sb.append(").collect()");
				sb.append(file.substring(finalInd+1,file.length()));
				i+=finalInd + 1;
				file = sb.toString();
			}
		}
		sb = new StringBuilder();
		for(int i = 0; i < file.length()-11; i++) {
			if(file.substring(i, i+12).equals("reduceByKey(")){
				sb.append(file.substring(0,i));
				sb.append("groupByKey(_._1).agg(reduceByKeyAggregator(");
				int finalInd = findEndParenthesis(i+11);
				sb.append(file.substring(i+12,finalInd+1));
				sb.append(")");
				sb.append(file.substring(finalInd+1,file.length()));
				i+=finalInd + 1;
				file = sb.toString();
			}
		}
		sb = new StringBuilder();
		for(int i = 0; i < file.length()-6; i++) {
			if(file.substring(i, i+7).equals("sortBy(")){
				sb.append(file.substring(0,i));
				sb.append("map(row=>((");
				int finalInd = findEndParenthesis(i+6);
				sb.append(file.substring(i+6,finalInd+1));
				sb.append("(row), row)).orderBy(_1).map(_._2)");
				sb.append(file.substring(finalInd+1,file.length()));
				i+=finalInd + 1;
				file = sb.toString();
			}
		}
		
	}
	
	private static int findEndParenthesis(int i) {
		
		int balance = 1;
		
		while(balance != 0 && i < file.length()) {
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

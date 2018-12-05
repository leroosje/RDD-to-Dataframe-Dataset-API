import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * This is the main class for the Tokenization
 */

/**
 * @author Danny Reinheimer
 * Much of this class was written by Danny Reinheimer under Dr. Xipeng Shen and was
 * was used with permission of Dr. Shen for this project.
 * 
 * All transformation rules within main have been added and created by Luke Roosje
 */
public class Tokenization {

	/**
	 * @param args
	 *            The file name
	 */
	public static void main(String[] args) {
		// checks to see if we are given any arguments
		if (args.length < 1) {
			System.err.println("Please provide an input file to process");
			System.exit(1);
		}

		boolean hasInvalid = false;
		String fileName = args[0];
		Scan scan = new Scan(fileName);
		Pair<TokenNames, String> tokenPair;
		
		try {
			// get the name of the file minus the dot
			int pos = fileName.lastIndexOf(".");
			String newFileName = fileName.substring(0, pos) + "_gen.scala";
			PrintWriter writer = new PrintWriter(newFileName, "UTF-8");

			// keep getting the next token until we get a null
			while ((tokenPair = scan.getNextToken()) != null) {
				// check to see if the token is an identifer but not main
				// if(tokenPair.getKey() == TokenNames.Identifier &&
				// !tokenPair.getValue().equals("main")) {
				if (tokenPair.getKey() != TokenNames.None) {
					String newName = tokenPair.getValue();
					StringBuilder sb = new StringBuilder();
					
					if(newName.equals("sc")){
						System.out.println("save me");
						
						sb.append("spark");

					newName = sb.toString();
					}			
				
					if(newName.equals("textFile")){

						sb.append("read.textFile");

						newName = sb.toString();
					}
			
					if(newName.equals("reduce")){
						sb.append("select(reduceAggregator");
						tokenPair = scan.getNextToken();
						while(!tokenPair.getValue().equals(")")) {
							sb.append(tokenPair.getValue());
							tokenPair = scan.getNextToken();
						}
						sb.append(")).collect()");
						newName = sb.toString();
					}

					if(newName.equals("reduceByKey")){
						
						sb.append("groupByKey(_._1).agg(reduceByKeyAggregator");
						tokenPair = scan.getNextToken();
						while(!tokenPair.getValue().equals(")")) {
							sb.append(tokenPair.getValue());
							tokenPair = scan.getNextToken();
						}
						sb.append("))");
						newName = sb.toString();
					}

					if(newName.equals("sortBy")){
						sb.append("map(row=>(");
						tokenPair = scan.getNextToken();
						while(!tokenPair.getValue().equals(")")) {
							sb.append(tokenPair.getValue());
							tokenPair = scan.getNextToken();
						}
						//tokenPair = scan.getNextToken();
						sb.append(")(row), row)).orderBy(_1).map(_._2)");
						newName= sb.toString();
					}
					writer.print(newName);
					/*
					 * This is where the transformation is going to go. Or rather,
					 * its gonna be a bunch of if statements looking for things needing to be transformed
					 * and calling specific functions that writes out proper things to the file
					 */
				} else {
					hasInvalid = true;
				}
			}
			if (hasInvalid) {
				writer.print("//The input program contains errors for scanning");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not create output file");
			System.exit(1);
		} catch (UnsupportedEncodingException e) {
			System.err.println("Error encoding output file.  Not my fault though");
			System.exit(1);
		}

	}
}

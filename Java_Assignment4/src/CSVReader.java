import java.io.*;
import java.util.*;
/**
 * Program which retrieves some data from CSV files
 * @author Shayan Shadpour - 104399871
 *
 */
public class CSVReader {
private static BufferedReader buffReader;
private static BufferedReader buffReader1;
private static BufferedReader buffReader2;

/**
 * Constructor method for the class, opens up the file for viewing.
 * @param s the name of the file we want to open
 * @throws FileNotFoundException in case the file is not found
 */
public CSVReader(String s) throws FileNotFoundException{
	String str = s;
	
	buffReader = new BufferedReader(new FileReader(str));
	buffReader1 = new BufferedReader(new FileReader(str));
	buffReader2 = new BufferedReader(new FileReader(str));
	
	
}

/**
 * Method which determines the total number of rows in the file.
 * @return the number of rows in a given file
 * @throws IOException in case of input/output error
 */
public int numberOfRows() throws IOException{
	int rows = 0;
	
	while(buffReader.readLine() != null) {
		rows++;
	}
	
	return rows;
	
}

/**
 * Method which determines the number of fields in a given row of the file
 * @param row the specific row we want to work in
 * @return the number of fields in a row of the file
 * @throws IOException in case of input/output error
 */
public int numberOfFields(int row) throws IOException{
	
	int rows = 1;
	while(rows<row) {
		buffReader1.readLine();
		rows++;
	}
	
	int col = 0;
	StringTokenizer token = new StringTokenizer(buffReader1.readLine(),",");
	
	while(token.hasMoreElements()) {
		token.nextToken();
		col++;
	}
	
	return col;
}

/**
 * Method which finds the field in a specific row/column
 * @param row the row we want to find
 * @param col the column we want to find
 * @return the field in a particular row and column
 * @throws IOException in case of input/output error
 */
public String field(int row, int col) throws IOException{
	int rows = 1;
	while(rows>row) {
		buffReader2.readLine();
		rows++;
	}
	int cols = 1;
	StringTokenizer token = new StringTokenizer(buffReader2.readLine(),",");
	while(token.hasMoreElements() && cols>col) {
		token.nextToken();
		cols++;
	}
	return token.nextToken();
}

}

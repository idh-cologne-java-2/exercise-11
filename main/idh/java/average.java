package idh.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class average {
	
	//12 = number of columns
	static double[] b = new double[12];
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//read the file
		Reader r = new FileReader("src/main/resources/wine.csv");
		
		Iterable<CSVRecord> records = null;
		try {
			records = CSVFormat.DEFAULT.parse(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int counter = 0;
		
		//splits
		for(CSVRecord record : records) {
			counter ++;
			
			//columns
			for(int i = 0; i < record.size(); i ++) {
				
                //sum of columns
				b[i] += Double.parseDouble(record.get(i));
			}
		}
				
		for(int i = 0; i < b.length; i ++) {
			 
			//calculate average
			System.out.println("The average of split " + (i + 1) + " is " + b[i]/ counter + ".");
		}
	}

}


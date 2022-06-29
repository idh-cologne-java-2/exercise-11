package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Wine {
	static double[] da = new double[12];
	static int counter = 0;

	public static void main(String[] args) throws IOException {
		Reader fr = new FileReader("src/main/resources/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
		
		for(CSVRecord record: records) {
			counter++;
			
			for(int i = 0; i < record.size(); i++) {
				da[i] += Double.parseDouble(record.get(i));
			}
		}
		
		for(int i = 0; i < da.length; i++) {
			double av = da[i] / counter;
			System.out.println("The average of column " + (i+1) + " is " + av + ".");
		}
	}

}

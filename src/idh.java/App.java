package idh.java;

import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;

public class App {
	
	
	public static void main(String[] args) {
		
		double[] helpArray = new double[12];
		long[] column = new long[12];

		try {
			
			Reader in = new FileReader("src/main/resources/wine.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
			
			for (CSVRecord rec : records) {
				for (int i = 0; i < 12; i++) {
					helpArray[i] += Double.parseDouble(rec.get(i));
					column[i] = rec.getRecordNumber();
				}
			}
			for (int i = 0; i < 12; i++) {
				double d = helpArray[i] / column[i];
				System.out.println("Column " + (i+1) + " : " + d);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

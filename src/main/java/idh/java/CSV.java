package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CSV {

	private static double[] column = new double[12];

	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("src/main/resources/wine.csv");
		
		Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(in);
		
		int row = 0;
		for (CSVRecord record : records) {
			row++;
			
			for (int i = 0; i < record.size(); i++) {
				column[i] += Double.parseDouble(record.get(i));
			}
		}
		
		System.out.println("Durchschnitt der Spalten\n");
		for (int i = 0; i < column.length; i++) {
			double average = column[i] / row;
			
			System.out.println((i + 1) + ". Spalte: " + average);
		}
	}

}

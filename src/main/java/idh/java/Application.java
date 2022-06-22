package idh.java;

import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		double[] hilfsArray = new double[12];
		long[] spalten = new long[12];
		int counter = 1;

		try {
			Reader in = new FileReader("src/main/resources/wine.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
			for (CSVRecord record : records) {
				for (int i = 0; i < 12; i++) {
					hilfsArray[i] = hilfsArray[i] + Double.parseDouble(record.get(i));
					spalten[i] = record.getRecordNumber();
				}
			}
			for (int i = 0; i < 12; i++) {
				double mean = hilfsArray[i] / spalten[i];
//				counter++;
				System.out.println("Durchschnitt der Spalte " + counter++ + " beträgt " + mean);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Averages {

	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("src/main/resources/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
		double[] sums = new double[12];
		int n = 0;
		
		// setting initial values to 0
		for (int i = 0; i < sums.length; i++) {
			sums[i] = 0.0;
		}

		// Going over the CSV entries
		for (CSVRecord record : records) {
			for (int i = 0; i < 12; i++) {
				sums[i] += Double.valueOf(record.get(i));
			}
			n++;
		}
		
		// Calculating and printing averages
		for (int i = 0; i < sums.length; i++) {
			System.out.print(sums[i] / n);
			System.out.print(" ");
		}

	}

}

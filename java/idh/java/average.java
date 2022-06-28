package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.*;


public class average {	

	public static void main(String[] args) throws IOException {
		Reader f = new FileReader("src/main/resources/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(f);
		double[] d = new double[12];
		int counter = 0;
	
		for(CSVRecord record : records) {
			counter++;

			for(int i = 0; i < record.size(); i++) {
				d[i] += Double.parseDouble(record.get(i));
			}
		}
		
		for(int i = 0; i < d.length; i++) {
			double sum = d[i] / counter;
			
			System.out.println("Der Durchschnitt der " + (i+1) + ". Spalte ist " + sum);
		}
	}

}
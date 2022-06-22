package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.*;


public class Wine {
	
	static double[] d = new double[12];
	

	public static void main(String[] args) throws IOException {
	
		Reader in = new FileReader("src/main/resources/wine.csv");
		
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
		
		int counter = 0;
		
		// Zeilen
		for(CSVRecord record : records) {
			counter++;
			
			//Spalten
			for(int i = 0; i < record.size(); i++) {
				
				// Summe der jeweiligen Spalte berechnen
				d[i] += Double.parseDouble(record.get(i));
			}
		}
		
		//über alle Summen iterieren und diese durch Anzahl der Einträge teilen
		for(int i = 0; i < d.length; i++) {
			double f = d[i] / counter;
			
			System.out.println("Der Durchschnitt der " + (i+1) + ". Spalte ist " + f);  // oder hier direkt berechnen: d[i] / counter);
		}
	}

}

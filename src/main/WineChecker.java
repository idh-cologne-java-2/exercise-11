package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class WineChecker {

	public static void main(String[] args) {
		
		Reader in = null;
		try {
			in = new FileReader("src/main/resources/wine.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterable<CSVRecord> records = null;
		
		try {
			records = CSVFormat.EXCEL.parse(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Hilfsvariablen, wie Spalten Anzahl herausfinden?
		double[] dA = new double[12];
		long[] counter = new long[12];		
		
		for (CSVRecord record : records) {
			for(int i=0;i<12;i++) {
				dA[i] = dA[i]+ Double.parseDouble(record.get(i));
				//System.out.println(dA[i]);
				counter[i] = record.getRecordNumber();
			}
			//System.out.println(dA[1]);
			
		}
		for(int i=0;i<12;i++) {
			double help = dA[i]/counter[i];
			System.out.println("Spalte " + (i+1) +" hat eine Durchschnitt von "+ help);
			
		}
	}
}

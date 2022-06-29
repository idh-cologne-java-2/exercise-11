
package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;


public class Durchschnitt {



	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("src/main/resources/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		
		for (CSVRecord record : records) {
			double val = 0.0;
			for (int i=0; i< record.size(); i++ ) {
				
				val += Double.valueOf(record.get(i));
			

			System.out.println(val/record.size());
		}}
	
	}
}

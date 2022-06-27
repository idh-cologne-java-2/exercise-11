import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class average {
	
	public static void main(String[] args) throws IOException {
		
		Reader in = new FileReader("src/main/resources/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		float average;
		for (CSVRecord record : records) {
			for (int i=1; i < record.size(); i++) {
				average = Float.parseFloat(record.get(0));
				average += Float.parseFloat(record.get(i));
			}
			//String columnOne = record.get(0);
			//String columnTwo = record.get(1);
			//System.out.println(Float.parseFloat(columnOne));
		    //System.out.println(columnOne+columnTwo);
		    //int[] ints = columnOne.split("");
			
		}
		System.out.println(average);
	}
}


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.*;

public class App {

	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("src/main/recources/wine.csv");
		
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
		int counter = 0;
		
		for(CSVRecord record : records) {
			counter++;
			
			for(int i = 0; i < record.size(); i++) {
				d[i] += Double.parseDouble(record.get(i));
			}
		}
		
		for(int i = 0; i < d.length; i++) {
			double f = d[i] / counter;
			System.out.println("Durschnitt der " + (i + 1) + "Spalte ist" + f);
		}
	}
}

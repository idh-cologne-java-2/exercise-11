package DefaultM;

import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;

import org.apache.commons.csv.*;

public class LineReader {

	public static void main(String[] args) throws IOException{
		int counter = 1;
		double elementValue = 0.0;
		Reader csv = new FileReader("src/main/resources/wine.csv");
		
		Iterable<CSVRecord> csvFormat = CSVFormat.RFC4180.parse(csv);
		
		for(CSVRecord i : csvFormat) {
			for(int m = 0; m < i.size(); m++) {
				elementValue += Double.parseDouble(i.get(m));
				elementValue = elementValue / i.size();
			}
			System.out.println("Durchschnitt Zeile " + counter + ": " + elementValue);
			counter++;
		}
		
		
		csv.close();
	}
}

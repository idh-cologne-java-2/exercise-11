import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.*;


public class App {
	
	static double[] d = new double[12];
	

	public static void main(String[] args) throws IOException {
	
		Reader in = new FileReader("src/main/resources/wine.csv");	
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);	
		int counter = 0;
		
		for(CSVRecord record : records) {
			counter++;
			
			for(int i = 0; i < record.size(); i++) {
				
				d[i] += Double.parseDouble(record.get(i));
			}
		}
		
		for(int i = 0; i < d.length; i++) {
			double v = d[i] / counter;
			
			System.out.println(v);
		}
	}

}
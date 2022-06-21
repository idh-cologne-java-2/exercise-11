import java.io.*;
import org.apache.commons.csv.*;



public class App {

		public static void main(String[]args) {
			
			Reader in = null;
			Iterable<CSVRecord> records = null; 
			try {
				 in = new FileReader("src/main/resources/wine.csv");
				 records = CSVFormat.EXCEL.parse(in);
			}catch( IOException ex ) {
				System.out.println(ex.getMessage() + "\n"); 
			}
			
			// 2 loops calculating the avarage 
			for(CSVRecord record : records) {
				double value = 0.0 ; 
				for(int i = 0; i < record.size();i++) {
					value += Double.parseDouble(record.get(i)); 
				}
				value = value / record.size(); 
				System.out.println(value);
				
				
			}
			
		
			
			
			
			
			
			
			
			
			
			
			
		}
}

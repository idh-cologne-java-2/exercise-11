package idh.main.java;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.Reader;
	import org.apache.commons.csv.CSVFormat;
	import org.apache.commons.csv.CSVRecord;

  public class wine_class {
		static double[] d = new double[12];
		
	public static void main(String[] args) throws IOException {
			Reader reader = new FileReader("src/main/resources/wine.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
			int zahl = 0;
			for(CSVRecord record : records) {
				zahl++;
				for (int i = 0; i < record.size(); i++) {
					d[i] += Double.parseDouble(record.get(i));
				}
			}
			for (int i = 0; i < d.length; i++) {
				double durchschnitt = d[i] / zahl;
				System.out.println("Durchschnitt der Spalte " + (i + 1) + ": " + durchschnitt);
			}
	}
}
/**
 * @author UntoastedToast
 *
 */

package idh.java;

import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class App {

	static double[] d = new double[12];

	public static void main(String[] args) throws IOException {

		FileReader in = new FileReader("src/main/resources/wine.csv");

		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);

		int c = 0;

		for (CSVRecord record : records) {
			c++;

			for (int i = 0; i < record.size(); i++) {

				d[i] += Double.parseDouble(record.get(i));
			}
		}

		for (int i = 0; i < d.length; i++) {
			double f = d[i] / c;

			System.out.println("Column " + (i + 1) + " ==> " + f);
		}
	}
}

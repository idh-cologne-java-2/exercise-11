package idh.java;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Wine {

	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("src/wine.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
		double[] sum = new double[12];
		int l = 0;
		for (CSVRecord record : records) {
			for (int i = 0; i < 12; i++)
			sum[i] += Double.valueOf(record.get(i));
			l++;
		}
		for(int i = 0; i < sum.length; i++)
		System.out.println(Double.valueOf(sum[i] / l));

	}

}

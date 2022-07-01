import java.io.*;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

  class Wine<records> {


     public static void main(String[]args) throws IOException {
//File csvData = new File("main/resources/wine.csv");
         //CSVParser parser = CSVParser.parse(String.valueOf(csvData), CSVFormat.RFC4180);
         Reader in = new FileReader("main/resources/wine.csv");
         Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
         double[] sums = new double[12];
         int n = 0;
         //reads the file and sets up the counter
         for (CSVRecord record : records) {
             for (int i = 0; i < 12; i++) {
                 sums[i] += Double.valueOf(record.get(i));
             }
             n++;
         }
         //this goes over the CSV entries

         for (int i = 0; i < sums.length; i++) {
             System.out.println(sums[i] / n);
             System.out.print("");
             //Calculate and print averages


             //  int count = 0;

   /* Scanner sc = new Scanner("main/resources/wine.csv");
    //Create a scanner object associated with the file

    while(sc.hasNextLine()){
        sc.nextLine();
        count++;
        //read each line and count number of lines
       */
             //Previous attempt at counting lines
         }


     }
     }


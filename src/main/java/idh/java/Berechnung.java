package idh.java;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.Arrays;

public class Berechnung {

    //Double Array der Länge 12 (Anzahl Spalten)
    static double[] a = new double[12];

    public static void main(String[] args) throws IOException {
        Arrays.fill(a, 0);

        Reader in = new FileReader("src/main/resources/wine.csv");

        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);

        int counter = 0;

        for (CSVRecord record : records) { //Zeilen
            counter++;

            for(int i = 0; i < record.size(); i++) //Spalten
            {
                //Summe jeder einzelnen Spalte bilden und in Array speichern
                a[i] += Double.parseDouble(record.get(i));
            }
        }

        //Über alle Summen laufen
        for (int i = 0; i < a.length; i++){

            //Durschnitt errrechnen: Summe jeder einzelnen Spalte durch Anzahl der Einträge dividieren
            System.out.println("Der Durschnitt der " + (i+1) + ". Spalte ist: " + a[i] / counter);
        }


    }
}



package de.uzk.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class berechnen{
	
	public static void main(String[] args) {
		
		List<String> lines = null;

		try {
			lines = Files.readAllLines(Paths.get("src/main/resources/wine.csv"));
		}
		catch (IOException ex) {
		  ex.printStackTrace();
		}
		float berechnen = sum / (float) countOfNumbers;		
	}
}

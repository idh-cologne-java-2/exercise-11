package de.uzk.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class average {
	
	
	public static void main(String[] args) {
		
		List<String> tableContentLines = null;

		try {
			tableContentLines = Files.readAllLines(Paths.get("src/main/resources/wine.csv"));
		}
		catch (IOException ex) {
		  ex.printStackTrace();
		}
		
		System.out.println(tableContentLines.size() + "\n");
		// currentLine = tableContentLines.get((tableContentLines.size()));

	}

}

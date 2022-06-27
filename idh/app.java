import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class app {
	
	public static void main(String[] args) {
		
		List<String> liste = null;

		try {
			liste = Files.readAllLines(Paths.get("src/main/resources/wine.csv"));
		}
		
		catch (IOException ex) {
		  ex.printStackTrace();
		}
		
		System.out.println(liste.size() + "\n");
	}
}

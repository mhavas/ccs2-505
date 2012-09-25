import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Farmer {
	private List<Animal> animalList;
	private Set<String> listOfSounds;
	public Farmer() {
		animalList = new ArrayList<Animal>();
		listOfSounds = new HashSet<String>();
		listOfSounds.add("MOO");
		listOfSounds.add("BARK");
	}
	public void plow() {
		
	}
	public String listen(String filename) {
		String animals = "";
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader(filename));
			String line = "";
			while( (line = br.readLine()) != null) {
				Scanner scan = new Scanner(line);
				String token = "";
				while( (token = scan.next()) != null ) {
					if(listOfSounds.contains(token)) {
						if(token == "MOO") {
							animalList.add(new Cow());
						}
						else if(token == "BARK") {
							animalList.add(new Dog());
						}
					}
				}
			}
			
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.err);
		}
		finally {
			if(br != null) {
				try {
					br.close();
				}
				catch(IOException e) {
					System.err.println(e);
					e.printStackTrace(System.err);
				}
				
			}	
		}
		return animals;
		
	}
}

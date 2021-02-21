package assignment1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class filereader {
private static void read(String filename) throws FileNotFoundException {
	FileReader reader = new FileReader(filename);
      }

public static void main(String[]args) {
	try {
		read(args[0]);
		System.out.println("done");
		
	}catch (FileNotFoundException ex) {
		System.out.println("1");
	}
	catch (Exception ex) {
		System.out.println("2");
	}
}
}

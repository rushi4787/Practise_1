package Program_practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File_Read {

	public static void main(String[] args) throws Throwable {

		// Approch 1
		File file = new File("C:\\Users\\atulg\\OneDrive\\Documents\\BDD_FRAMEWORK_ATUL_COMAP.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String st = sc.nextLine();
			// System.out.println(st);
		}
		sc.close();
		
		//Approch 2

		FileReader f = new FileReader("C:\\Users\\atulg\\OneDrive\\Documents\\BDD_FRAMEWORK_ATUL_COMAP.txt");

		BufferedReader bf = new BufferedReader(f); 

		String s;
		while ((s = bf.readLine()) != null) {

			System.out.println(s);
		}

	}

}

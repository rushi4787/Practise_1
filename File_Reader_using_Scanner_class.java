package Program_practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Reader_using_Scanner_class {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\atulg\\OneDrive\\Documents\\CDAC\\English.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())

		{
			System.out.println(sc.nextLine());

		}
		sc.close();
		
		

	}

}

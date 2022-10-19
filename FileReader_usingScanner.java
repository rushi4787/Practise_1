package Program_practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader_usingScanner {

	public static void main(String[] args) throws Throwable {
		File file = new File("C:\\Users\\atulg\\OneDrive\\Documents\\Allmethods for interviwe.txt");
				//"C:\Users\atulg\OneDrive\Documents\Allmethods for interviwe.txt"
	Scanner sc= new Scanner(file);
	String str="";
	FileWriter fr= new FileWriter("C:\\Users\\atulg\\Downloads\\New folder\\Rushi.txt");
	BufferedWriter wri = new BufferedWriter (fr);
	while(sc.hasNext())
	{
		System.out.println(sc.nextLine());
		wri.write(sc.nextLine());
		str=sc.nextLine();
	}
	//"C:\Users\atulg\Downloads\New folder\Rushi.txt"
	
	
	
	wri.flush();
			

	}

}

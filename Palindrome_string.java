package Program_practise;
import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String str1=str;
		String rev="";
		
		
		for (int i=0;i<str.length();i++)
		{
		rev= str.charAt(i)+rev;
		
		}
		System.out.println(rev);
		if(str1.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String not palindrome");
		}
		

	}

}

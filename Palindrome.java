package Program_practise;

public class Palindrome {

	public static void main(String[] args) {
		String str= "Rushi";
		String rev="";
		for (int i=0;i<str.length();i++)
		{
			rev= str.charAt(i)+rev;
		}
		if (rev.equalsIgnoreCase(str))
		{
			System.out.println("String is plaindrome");
		}
		else
		{
			System.out.println("String is not palidrome");
		}
		
		

	}

}

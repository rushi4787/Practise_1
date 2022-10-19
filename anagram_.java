package Program_practise;

import java.util.Arrays;

public class anagram_ {

	public static void main(String[] args) {
		String s1= "abac";
		String s2= "cba";
		String [] a1=s1.split("");
		Arrays.sort(a1);
		String a2[] =s2.split("");
		Arrays.sort(a2);
		
	boolean same=	Arrays.equals(a1, a2);
	
	if (same==true)
	{
		System.out.println("Strings are anagram");
	}
	else
	{
		System.out.println("string are not anagram");
	}
		
				
		
		

	}

}

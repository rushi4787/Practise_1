package Program_practise;

import java.util.Arrays;

public class Anagram_programs {

	public static void main(String[] args) {
		
		String s1= "abcckf";
		String s2= "kcbfac";
		String s3[]=s1.split("");
		Arrays.sort(s3);
		System.out.println(Arrays.toString(s3));
		String s4[]=s2.split("");
		Arrays.sort(s4);
		System.out.println(Arrays.toString(s4));
		
	
		
		if (Arrays.equals(s3, s4))
		{
			System.out.println("String are anagram");
		}
		else 
		{
			System.out.println("String are not anagram");
		}
		
	
		

	}

}

package Program_practise;

public class CountVowelConsonant {

	public static void main(String[] args) {
		 String str = "This is a really simple sentence";  
		 
		 int Vcount=0;
	     int Ccount=0;
		 str= str.toLowerCase().replaceAll("\\s+", "");
		 
		 for (int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			 {
				
				 
				 Vcount++;
			 
			 }
			 else
			 {
				 Ccount++;
			 }
		 }
		 
		 System.out.println("Count of  Vowel is:- "+ Vcount );
		 System.out.println("Count of Consonant is:- "+ Ccount );
		 System.out.println(str.length());
		 
	}

}

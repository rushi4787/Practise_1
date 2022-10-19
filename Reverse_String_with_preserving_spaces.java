package Program_practise;

import java.util.Arrays;

public class Reverse_String_with_preserving_spaces {

	public static void main(String[] args) {
		String str = "rushikesh popat gadilakr";
		String[] st = str.split("\\s+");
		
		
		String d;
		for (int i = st.length-1; i >= 0; i--) {

			String s = st[i];
		
			String rev=" ";
		for(int j=0;j<s.length();j++)
		{
			rev= s.charAt(j)+rev;
			
			
		}
		
			
			System.out.print(rev);
			

		}
		

	}

}

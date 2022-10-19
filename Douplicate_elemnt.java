package Program_practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Douplicate_elemnt {

	public static void main(String[] args) {
		String s = "rushikesh";
		String s1[] = s.split("");

		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		
	Set set = new HashSet();
	for (int i=0;i<s1.length;i++)
	{
		set.add(s1[i]);
		
	}
	System.out.println(set);
	

	}

}

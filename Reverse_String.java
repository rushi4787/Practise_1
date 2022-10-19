package Program_practise;

import java.util.Arrays;

public class Reverse_String {

	public static void main(String[] args) {
		String str = "rushikesh    Gadilakr";

		String[] a = str.split("\\s+");

		String st = "";
		for (int i = 0; i < a.length; i++) {

			String s = a[i];

			String rev = " ";
			for (int j = 0; j < s.length(); j++) {
				rev = s.charAt(j) + rev;

			}

			st = st+rev;

		}
		System.out.println(st);
	}

}

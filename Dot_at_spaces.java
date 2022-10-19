package Program_practise;

import java.util.Arrays;

public class Dot_at_spaces {

	public static void main(String[] args) {
		String str = "Rushikesh Popat Gadilkar";
		String[] s = str.split(" ");

		String n = "";
		String A = "";
		String B = "";
		String C = "";

		for (int i = 0; i < s.length; i++) {

			if (i == 0) {
				char a = s[i].charAt(0);
				A = String.valueOf(a);
			} else if (i == 1) {
				char b = s[i].charAt(0);
				B = String.valueOf(b);
			} else if (i == 2) {
				C = s[i];
			}
			String st = s[i];
		}
		n = n.concat(A + "." + B + "." + C);
		System.out.println(n);

	}

}

//System.out.println(n);
//for (int j=1;j<n.length();j++)
//{
//	char c= n.charAt(j);
//	System.out.print(c);
//}

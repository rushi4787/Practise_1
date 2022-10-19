package Program_practise;

import java.util.Arrays;

public class String_remove_white_spaces {

	public static void main(String[] args) {

		// Approch 1
		String s = "Rushikesh popat gadilakar";

		String str = s.replaceAll("\\s+", "");

		System.out.println(str);

		// Approch 2

		String st[] = s.split("\\s+");

		String Nword = "";
		for (int i = 0; i < st.length; i++) {

			String word = st[i];

			Nword = Nword.concat(word);

		}
		System.out.println(Nword);

	}

}

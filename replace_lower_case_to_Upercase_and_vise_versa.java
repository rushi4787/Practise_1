package Program_practise;

import java.util.Arrays;

public class replace_lower_case_to_Upercase_and_vise_versa {

	public static void main(String[] args) {
		String str = "Rushikesh Popat Gadilakr";

		String[] s = str.split(" ");

		char c = 'a';
		String sub = "";
		String name = "";
		for (int i = 0; i < s.length; i++) {
			String st = s[i];

			c = st.charAt(0);
			String m = String.valueOf(c).toLowerCase();
			sub = st.substring(1, st.length());
			name = name.concat(m + sub.toUpperCase() + " ");

		}
		System.out.println(name);

	}

}

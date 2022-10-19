package Program_practise;

import java.util.Arrays;

public class First_letter_capital_From_String {

	public static void main(String[] args) {

		String ss = "apple apple apple orange     orange mango";
		String[] ar = ss.split("\\s+");

		System.out.println(Arrays.toString(ar));

		int count = 0;
		String sub = "";
		String s = "";
		for (int i = 0; i < ar.length; i++) {

			String get = ar[i];
			for (int j = 0; j < get.length(); j++) {
				char c = get.toUpperCase().charAt(0);
				String f = String.valueOf(c);
				sub = ar[i].substring(1);

				s = f.concat(sub);

			}
			System.out.println(s);

		}

	}

}

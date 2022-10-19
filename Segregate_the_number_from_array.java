package Program_practise;

public class Segregate_the_number_from_array {

	public static void main(String[] args) {

		// System.out.println(r[0]);
		String[] str = { "123", "rushi", "100", "GADILKAR", "97" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].toLowerCase().charAt(0) >= 'a' && str[i].toLowerCase().charAt(0) <= 'z') {
				// System.out.println(str[i]);
			} else {
				System.out.println(str[i]);
			}
		}

	}

}

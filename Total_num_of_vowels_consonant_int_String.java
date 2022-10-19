package Program_practise;

public class Total_num_of_vowels_consonant_int_String {

	public static void main(String[] args) {
		String str = "aeiouwwr";
		str = str.toLowerCase();
		int vowels = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowels++;
			}

			else {
				consonant++;

			}
		}
		System.out.println("number of vowels:-"+vowels);
		System.out.println("number of consonant:-"+consonant);

	}

}

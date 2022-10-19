package Program_practise;

import java.util.Arrays;

public class Anagram {

	public void approch1() {
		String str1 = "abccba";
		String str2 = "cbaabc";
		int count = 0;

		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						count++;

					}
				}

			}
			if (count == str1.length()) {
				System.out.println("'strings are amangram");
			} else {
				System.out.println("Strings are not anagaram");
			}

		} else {
			System.out.println("lenght of Strings are not same so not valid for anagram");
		}

	}

	public void approch2() {
		String str1 = "asdfghjkll";
		String str2 = "lkjhgfdsal";
		if (str1.length() == str2.length()) {
			String[] String1 = str1.split("");
			String[] String2 = str2.split("");
			Arrays.sort(String1);

			Arrays.sort(String2);

			if (Arrays.equals(String1, String2)) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("String are not anagram");
			}

		} else {
			System.out.println("lenght of Strings are not same so not valid for anagram");
		}
	}

	public static void main(String[] args) {

		Anagram obj = new Anagram();
		obj.approch1();
		obj.approch2();
	}

}

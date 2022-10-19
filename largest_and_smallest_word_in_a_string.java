package Program_practise;

import java.util.Arrays;

public class largest_and_smallest_word_in_a_string {

	public static void main(String[] args) {
		String s = "India is a country";
		String[] st = s.split("\\s+");
		String str="";
		String str1="";
		//for largest word
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].length() < st[j].length()) {
					str = st[j];

				} else {
					str = st[i];
				}
			}

		}
		//for smallest word
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].length() > st[j].length()) {
					str1 = st[j];

				} else {
					str1 = st[i];
				}
			}

		}
		
		
		
		System.out.println("largest wors is:- "+str);
	
		System.out.println("smallest word is:- "+str1);
		

	}

}

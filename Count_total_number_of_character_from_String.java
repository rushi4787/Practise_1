package Program_practise;

import java.util.Arrays;

public class Count_total_number_of_character_from_String {

	public static void main(String[] args) {
		String str = "Rushikehs popat gadilakar";
		str = str.replaceAll("\\s+", "");
		int Word_count=str.length();
		System.out.println(Word_count);

	}

}
//String str = "He said, 'The mailman loves you.' I heard it with my own ears."; 
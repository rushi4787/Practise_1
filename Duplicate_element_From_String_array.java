package Program_practise;

import java.util.Arrays;

public class Duplicate_element_From_String_array {

	public static void main(String[] args) {
		
		String str="apple apple    apple orange orange mango";
		String[] ar = str.split("\\s+");
		String word = "";

		for (int i = 0; i < ar.length; i++) {
			int count = 1;
			word = ar[i];

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j].equalsIgnoreCase(word)) {
					count++;
					ar[j]="0";
					System.out.println(Arrays.toString(ar));

				}
			}
			if (count > 1 && ar[i]!="0") {

				System.out.println(word + " " + count);
			}
		}

	}

}

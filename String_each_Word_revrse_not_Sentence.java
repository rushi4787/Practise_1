package Program_practise;

public class String_each_Word_revrse_not_Sentence {

	public static void main(String[] args) {
		String str = "Rushikesh Popat Gadilkar";

		String[] arr = str.split(" ");
		String st = "";
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			String rev = " ";

			for (int j = 0; j < s.length(); j++) {

				rev = s.charAt(j) + rev;

			}

			st = st.concat("" + rev);

		}
		System.out.println(st);

	}

}

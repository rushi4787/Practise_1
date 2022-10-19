package Program_practise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Segregate_number_words_from_Aarray {

	public static void main(String[] args) {
		String s[] = { "ruhsi", "123", "Atul", "233" };
		char c = '1';
		List<String> list = new ArrayList();

		for (int i = 0; i < s.length; i++) {
			String st = s[i];
			if (st.toLowerCase().charAt(0) >= 'a' && st.toLowerCase().charAt(0) <= 'z')

			{
				System.out.println("words  from array:-");
				System.out.println(s[i]);
			} else {
				System.out.println("number  from array:-");
				System.out.println(s[i]);
				list.add(s[i]);

			}
			System.out.println(list);
			String[] l = new String[list.size()];
			for (int k = 0; k < list.size(); k++) {
				l[k] = list.get(k);

			}

			System.out.println(Arrays.toString(l));

		}

	}

}

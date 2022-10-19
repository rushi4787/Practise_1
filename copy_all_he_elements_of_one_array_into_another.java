package Program_practise;

import java.util.Arrays;

public class copy_all_he_elements_of_one_array_into_another {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 0, 2, 4, 5, 4, 3, 6, 7, 85, 43, };

		int[] b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

	}

}

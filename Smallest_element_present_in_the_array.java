package Program_practise;

import java.util.Arrays;

public class Smallest_element_present_in_the_array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 0, 2, 4, 5, 4, 3, 6, 7, 85, 43, };
		Arrays.sort(a);
		System.out.println(a[0]);

	}

}

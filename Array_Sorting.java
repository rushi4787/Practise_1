package Program_practise;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 5 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					count = arr[i];
					arr[i] = arr[j];
					arr[j] = count;

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}

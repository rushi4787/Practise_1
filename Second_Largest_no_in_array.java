package Program_practise;

import java.util.Arrays;

public class Second_Largest_no_in_array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		
		for (int i = 0; i < arr.length; i++) {
			int count;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {

					count = arr[i];
					arr[i] = arr[j];
					arr[j] = count;

				}
			}
		}
		System.out.println(Arrays.toString(arr));// sorted order

		System.out.println(arr[1]); // second largest number

	}

}

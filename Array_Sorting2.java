package Program_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Sorting2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 4, 3, 6, 7, 8, 9, 4, 5, 5 };

		for (int i = 0; i < arr.length; i++) {
			int k = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;

				}
			}
		}
		System.out.println(Arrays.toString(arr));
		// Short cut 2
		int[] ar = { 1, 2, 3, 6, 4, 3, 6, 7, 8, 9, 4, 5, 5 };
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));

		// by using collection 3
		int[] a = { 1, 2, 3, 6, 4, 3, 6, 7, 8, 9, 4, 5, 5 };

		List list = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);

		}
		Collections.sort(list);
		System.out.println(list);

	}

}

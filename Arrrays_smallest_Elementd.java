package Program_practise;

public class Arrrays_smallest_Elementd {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 3, 6, 7, 8, 7, 15 };

		int small = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					small = a[j];
				}

			}

		}
		System.out.println(small);

	}

}

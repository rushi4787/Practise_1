package Program_practise;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Binary_search {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 3, 8, 9 };
		Arrays.sort(arr);
		int first = 0;
		int last = arr.length - 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int key = sc.nextInt();
		Sort_Binary_search obj = new Sort_Binary_search();
		obj.binar_sraech(arr, first, last, key);

	}

	void binar_sraech(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		System.out.println(mid);

		while (first <= last) {

			if (arr[mid] < key) {
				first = mid + 1;
				mid = (first + last) / 2;

			} else if (arr[mid] == key) {
				System.out.println("number is found " + arr[mid]);
				break;
			} else if (arr[mid] > key) {
				last = mid - 1;
				mid = (first + last) / 2;

			}

		}
		if (first > last) {
			System.out.println("number is  not found");
		}

	}

}

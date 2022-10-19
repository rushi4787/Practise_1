package Program_practise;

import java.util.Arrays;
import java.util.Scanner;

public class sqaure_root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int sqaure_root = 0;

		for (int i = 2; i < num; i++) {
			if ((num % (i * i)) == 0) {
				sqaure_root = i;

			}

		}
		if (sqaure_root > 2)
			System.out.println("sqaure root is :-" + sqaure_root);
		else {
			System.out.println("number is not full/perfect sqaure");
		}

	}

}

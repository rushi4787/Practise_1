package Program_practise;

import java.util.Arrays;

public class Matrix_Multiplication_ {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int sum = 0;

		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;

			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + c[i][j]);
			}

			System.out.println();
		}

	}
}

package Program_practise;

public class Triangle_pattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			for (int a = 4; a >= i; a--) {
				System.out.print(" ");
			}
			for (int s = 4; s > i; s--) {
				System.out.print(" ");
			}
			for (int q = 0; q <= i; q++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}

package Program_practise;

import java.util.Scanner;

public class Calculator_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("press/enter 1 for start calculator");
		int d = sc.nextInt();
		while (d == 1) {

			System.out.println("Enter the value of A");
			int A = sc.nextInt();
			System.out.println("Enter the value of B");
			int B = sc.nextInt();
			int C = 0;
			char c[] = { '+', '-', '*', '/' };
			System.out.println("Enter the valueof C");
			System.out.println("Enter 0 for Sum");
			System.out.println("Enter 1 for subtrction");
			System.out.println("Enter 2 for Multipication");
			System.out.println("Enter 3 for divison");
			char l = c[sc.nextInt()];
			System.out.println(l);
			switch (l) {
			case '+':
				C = A + B;
				break;
			case '-':
				C = A - B;
				break;
			case '*':
				C = A * B;
				break;
			case '/':
				C = A / B;
				break;

			}
			System.out.println(C);
			System.out.println("for continue press 1 ");
			System.out.println("for flushing  press 0  or either than 1 ");
			d = sc.nextInt();

		}
		System.out.println();

		System.out.println("Thank you ");

	}

}

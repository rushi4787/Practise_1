package Program_practise;

import java.util.Scanner;

public class ATM_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Password");
		String line = "";
		short number = '1';

		double  Bank_amount = 100000;
		int Add_amount;
		boolean T = true;
		while (T == true) {
			int Password = sc.nextInt();

			if (Password == 1234) {
				System.out.println("Enter 1 for Withdrwal");

				System.out.println("Enter 2 for Check Balance");

				System.out.println("Enter 3 for Add Amount");

				number = sc.nextShort();

				switch (number) {

				case 1:
					System.out.println("Enter The Amount ");
					int WithDraw_Amount = sc.nextInt();
					Bank_amount = Bank_amount - WithDraw_Amount;
					System.out.println(" Amount is Withdrwal " + WithDraw_Amount);
					System.out.println("your bank balance is :-" + Bank_amount);

					System.out.println();
					break;
				case 2:
					System.out.println("your bank balnce is:-" + Bank_amount);
					System.out.println();
					break;
				case 3:
					System.out.println("Enter the ADD Amount ");
					Add_amount = sc.nextInt();
					Bank_amount = Bank_amount + Add_amount;
					System.out.println("your bank balance is :-" + Bank_amount);
					System.out.println();
					break;

				}

			} else {
				System.out.println("Wrong passwoed try again");
			}
			System.out.println("for continue enter 'y' ");
			System.out.println();
			System.out.println("to Stop the Services enter the 'n'");
			System.out.println();

			line = sc.next().toLowerCase();
			if (line.equals("y")) {
				T = true;
				System.out.println("Enter The Password");
			} else {
				T = false;
				System.out.println();
				System.out.println("Thank you");
			}
		}

	}

}

package Program_practise;
import java.util.Scanner;

public class Bank_withdraw_Program {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		int[] arr = { 2000, 1000, 500, 200, 100, 50, 20, 10, 5,2,1};
		System.out.println("Enter the amount which you want to withdraw from bank");

		int data = sc.nextInt();
		int real_amount = data;
		int neae_amount = 0;
		int amount = 0;
		System.out.println("amount will be in cash :-");
		try {
			while (data != 0) {
				for (int i = 0; i < arr.length; i++) {

				if (data <= (arr[i]) && data >= arr[i+1]) 
				{

						try {
							System.out.println(arr[i+1]);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						neae_amount = arr[i+1];
						data = data - neae_amount;
						amount = neae_amount + amount;
						

					}

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println();
		}

	}

}

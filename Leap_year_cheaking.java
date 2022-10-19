package Program_practise;

import java.util.Scanner;

public class Leap_year_cheaking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println("Year is leap");
		} else {
			System.out.println("Year is not Leap");
		}

	}

}

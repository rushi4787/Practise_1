package Program_practise;

import java.util.Scanner;

public class int_to_char_vise_versa {

	public static void main(String[] args) {
		// int to char
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input as Integer number");
		int Int = sc.nextInt();
		char Char = (char) Int;
		System.out.println(Char);

		// char to int

		char Char2 = Char;

		int Int2 = Char2;

		System.out.println(Int2);

	}

}

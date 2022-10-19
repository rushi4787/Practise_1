package Program_practise;
import java.util.Scanner;

public class Find_Largest_number {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numner a");
		a = sc.nextInt();
		System.out.println("enter numner b");
		b = sc.nextInt();
		System.out.println("enter numner c");
		c = sc.nextInt();

		int temp = a > b ? a : b;

		int largest = c > temp ? c : temp;

		System.out.println("largets numbe is ");
		
		System.out.println(largest);

	}

}

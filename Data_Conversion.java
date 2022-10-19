package Program_practise;

public class Data_Conversion {

	public static void main(String[] args) {
		int a = 10;
		double b = 10;
		float c = 10;
		long d = 10;

		double z = a + d + c + b;

		float f = 10;
		int k = (int) f;
		System.out.println(k);

	}

}
//double>float>long>int
//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double

//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte

package Program_practise;

public class Conversion_of_int_into_long {

	public static void main(String[] args) {
		int num = 100;
		//approch 1
		long L1 = num;
		System.out.println("AutoCoversion:- "+L1);
		// approch 2
		Long L2 = new Long(num);
		System.out.println("By using Objet of Long wrapper class:- "+L2);
		// approch 3
		Long L3 = Long.valueOf(num);
		System.out.println("Long ValueOf:- " + L3);

	}

}

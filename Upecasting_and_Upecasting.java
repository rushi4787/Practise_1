package Program_practise;

public class Upecasting_and_Upecasting {

	public static void main(String[] args) {
		//Upecasting int to long
		int i1 = 10;
		Long l1 = new Long(i1); // Upcasting
		System.out.println("Upecasting int 10 to long 10 :-"+l1);
		
		
		// DownCasting long to int
		long l2= 1234;
		int i2= (int)l2;// DownCasting
		System.out.println("DownCasting long 1234 to int 1234:-"+i2);

	}

}

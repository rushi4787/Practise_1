package Program_practise;

public class Conversion_of_Long_into_int {

	public static void main(String[] args) {
		long num= 1234;
		//approch 1
		String st=String.valueOf(num);
		int i=Integer.parseInt(st);
		System.out.println(i);
		
		// approch 2 down casting 
		int value= (int)num;
		System.out.println(value);
		
		///upcasting 
		int k=50;
		Long lo= new Long(k);
		System.out.println(lo);
		
		
		
		
		

	}

}

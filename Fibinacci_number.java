package Program_practise;

public class Fibinacci_number {

	public static void main(String[] args) {

		int a = 0;

		int b=1;
		int c=0;
		
		for (int i=0;i<=5;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	
	}

}

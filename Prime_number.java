package Program_practise;

public class Prime_number {

	public static void main(String[] args) {
		int num= 153;
		
		
		String l= String.valueOf(num);
		int n0o_digit=l.length();
		int arm=0;
		while(num!=0)
		{
			int count=1;
			int rem= num%10;
			System.out.println(rem);
		for (int i=0;i<l.length();i++)
		{
			
			
			count = count*rem;
		
		
			
			
			
			
		}
		arm=arm+count;
		
		
		num=num/10;
		}
		
System.out.println(arm);
	}

}
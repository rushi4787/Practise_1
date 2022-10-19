package Program_practise;

public class Count_Punctuation {

	public static void main(String[] args) {
		String str = "He said, 'The mailman loves you.' I heard it with my own ears."; 
		
		str=str.toLowerCase().replaceAll("\\s+", "");
	
		
		
		int count=0;
		for (int i=0;i<str.length();i++)
		{
		if (str.charAt(i)<'a' || str.charAt(i)>'z')
		{
			count++;
		}
		else
		{
			
		}
		
		
		
		}
		System.out.println(count);
	}

}

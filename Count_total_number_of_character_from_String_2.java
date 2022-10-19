package Program_practise;

public class Count_total_number_of_character_from_String_2 {

	public static void main(String[] args) {
		String str = "Rushikehs popat gadilakar";
		
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}

package Program_practise;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo_ {

	public static void main(String[] args) {

		String str = "Pooja Rushi";
		
		char[] arr = str.toLowerCase().toCharArray();
		
		
		Map<Character, Integer> map= new HashMap();
		
		
		for (char c:arr)
		{
			Integer count=map.get(c);
			
			
		
			if (count ==null)
			{
				map.put(c, 1);
			}
			else
			{
				count++;
				map.put(c, count);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		
		
		
		for (Map.Entry<Character, Integer> a:set)
		{
			if (a.getValue()>1)
			{
				System.out.println(a.getKey()+" "+a.getValue());
			}
		}
		
		

	}

}

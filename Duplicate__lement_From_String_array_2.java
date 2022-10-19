package Program_practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate__lement_From_String_array_2 {

	public static void main(String[] args) {
		String str="apple apple apple apple orange apple orange mango";
		
		String [] ar= str.split("\\s+");
		Map <String ,Integer> map= new HashMap();
		
		for (String s:ar)
		{
			Integer count =map.get(s);
			
			
			if (count==null)
			{
				map.put(s, 1);
				
			}
			else
			{
				count++;
				map.put(s, count);
			}
		}
		
		
		Set<Map.Entry<String, Integer>> set =map.entrySet();
		
		
		for (Map.Entry<String, Integer> e:set)
		{
			if (e.getValue()>1)
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		
		

	}

}

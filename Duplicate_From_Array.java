package Program_practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_From_Array {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,5,6,1};
		
	Map<Integer, Integer> map =new HashMap();
	
	for (int i:arr)
	{
		
		Integer count =map.get(i);
		
		
		if (count== null)
		{
			map.put(i, 1);
			
		}
		else
		{
			count++;
			map.put(i, count);
		}
		
		
		
		
	}
Set <Map.Entry<Integer,Integer>> set	=map.entrySet();

for (Map.Entry<Integer,Integer> m:set)
{
	if (m.getValue()>1)
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}

	}

}

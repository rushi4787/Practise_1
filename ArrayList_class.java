package Program_practise;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_class {

	public static void main(String[] args) {
		List <String> list= new ArrayList<> ();
		
		list.add("rushi");
		list.add("atul");
		System.out.println(list);
		
		System.out.println(list.contains("rushi"));
		
		System.out.println(list.get(0));
		List <String> list1= new ArrayList<> ();
		list1.addAll(list);
		list1.add("Nitin");
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		
		
		
		
		
		

	}

}

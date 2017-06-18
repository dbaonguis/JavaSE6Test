package collections;

import java.util.*;

public class MyCollectionUtil {

	public static void main(String args[]) {
		Set set = new HashSet<String>();
		List list = new ArrayList<String>();

		set.add("C");
		set.add("B");
		set.add("A");
		set.add("A");
		set.add("D");
		
		doSomething(set);
		
		System.out.println("-------");
		
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("D");
		
		doSomething(list);
		
	}
	
	public static void doSomething(Collection collection) {
		
		Iterator iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			
			System.out.println(obj.toString());
			
		}
	}
	
}
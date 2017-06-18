package generics;

import java.util.*;

public class MyGenericsUtil {
	
	public static void main(String args[]) {
		
		/*
		 * LISTS
		 */
		
		List<String> listOfStrings = new ArrayList<String>();
		
		listOfStrings.add("One");
		listOfStrings.add("Two");
		listOfStrings.add("Three");
		
		Iterator<String> iterator = listOfStrings.iterator();
		
		while (iterator.hasNext()) {
			System.out.println( iterator.next() );
		}
		
		System.out.println("-------------");
		
		/*
		 * MAPS
		 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 6);
		map.put("Four", 4);
		
		iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key); 
			System.out.println(key + " / " + value);

		}
		
		
		/*
		 * GENERIC Classes
		 */
		
		GenericFactory<MyClass1> factory = new GenericFactory<MyClass1>(MyClass1.class);
		
		try {
			
			MyClass1 myClass1 = factory.createInstance();
			myClass1.setProperty1("Hey!");
			
			System.out.println("It works!");
			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		MyClass1 myClass = new MyClass1();
		
		
		
		
		
	}

}

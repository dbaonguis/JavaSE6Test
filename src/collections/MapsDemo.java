package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
	
	//Maps: HashMap, HashTable, TreeMap, LinkedHashMap
	//Key Value pairs - Not part of the Collections interface
	//
	//HashMap 		- ordering is not certain, depend on the compiler, key's hashcode is used for ordering (so we dont know wht it will be)
	//HashTable 	- like HashMap, but the methods are "synchronized", therefore it is good for multithreaded programming 
	//TreeMap 		- sorted and ordered by the keys, for example; if key is String type then the ordering will be alphabetical
	//LinkedHashMap	- ordering is based on the order of insertion of object, becuase the ordering is determined by the linkedHashses of the keys 



	public static void main(String args[]) {

		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		hashMap.put("Five", 5);
		hashMap.put("Six", 6);
		
		System.out.println("---HashMap-------");
		for (String value : hashMap.keySet()) {
			System.out.println( value );
		}
		System.out.println("");
		
		
		Map<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("One", 1);
		hashtable.put("Two", 2);
		hashtable.put("Three", 3);
		hashtable.put("Four", 4);
		hashtable.put("Five", 5);
		hashtable.put("Six", 6);
		
		System.out.println("---Hashtable-------");
		for (String value : hashtable.keySet()) {
			System.out.println( value );
		}
		System.out.println("");
		
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("One", 1);
		treeMap.put("Two", 2);
		treeMap.put("Three", 3);
		treeMap.put("Four", 4);
		treeMap.put("Five", 5);
		treeMap.put("Six", 6);
		
		System.out.println("---TreeMap-------");
		for (String value : treeMap.keySet()) {
			System.out.println( value );
		}
		System.out.println("");
		
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		linkedHashMap.put("Five", 5);
		linkedHashMap.put("Six", 6);
		
		System.out.println("---LinkedHashMap-------");
		for (String value : linkedHashMap.keySet()) {
			System.out.println( value );
		}
		System.out.println("");
	}
}
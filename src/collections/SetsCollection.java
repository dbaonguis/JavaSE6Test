package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsCollection {
	
	//Sets: HashSet, TreeSet, LinkedHashSet
	//All Does not allow duplicates
	//HashSet - ordering is not certain, depend on the compiler
	//TreeSet - guaranteed sorted, but sorted based on the compareTo or comparator implementation, String by default is ordered alphabetcally 
	//LinkedHashSet - ordered based on when the objects are ADDED
	
	
	
	public static void main(String args[]) {
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		
		for (String value : hashSet) {
			System.out.println( value );
		}
		
		System.out.println("-----------------");
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");
		
		for (String value : treeSet) {
			System.out.println( value );
		}
		
		System.out.println("-----------------");
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("Four");
		linkedHashSet.add("Five");
		
		for (String value : linkedHashSet) {
			System.out.println( value );
		}
		
	}

}

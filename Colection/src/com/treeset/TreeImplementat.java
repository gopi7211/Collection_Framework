package com.treeset;
import java.util.*;

public class TreeImplementat {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		SortedMap<Integer, Integer> tm2 = new TreeMap<Integer, Integer>();
		
		tm.put(1, 10); tm.put(2, 20); tm.put(3, 30); tm.put(4, 40); 
		tm.put(5, 50);  tm.put(5, 50); tm.put(6, 60); tm.put(7, 70); 
		
		
//		tm2.putAll(tm);
		
		for(Map.Entry<Integer, Integer> c:tm.entrySet()) {
//			System.out.println(c.getKey()+"->"+c.getValue());
		}
		
//		System.out.println(tm2);
		
//		Integer key =tm.get(7);
//		System.out.println(key);
		
		
//		if(tm.containsKey(6)) {
//			System.out.println("present");
//		}else {System.out.println("present");}
		
		
//		

		
//		Set keyset = tm.keySet();
//		System.out.println();
		
//		tm.clear();
//		System.out.println(tm);
		
		
//		System.out.println(tm);
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.lastEntry());
		
		
//		System.out.println(tm);
//		System.out.println(tm.firstKey());
//		System.out.println(tm.lastKey());
		
		
//		System.out.println(tm.reversed());
//		System.out.println(tm.descendingKeySet());
		 TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
		
		 tree_map1.put(10, "1");
		  tree_map1.put(20, "2");
		  tree_map1.put(40, "4");
		  tree_map1.put(50, "5");
		  tree_map1.put(60, "6");
		 
		 
//		  System.out.println("Checking the entry for 10: ");
//		  System.out.println("Value is: " + tree_map1.floorEntry(10));
//		  System.out.println("Checking the entry for 30: ");
//		  System.out.println("Value is: " + tree_map1.floorEntry(30));
//		  System.out.println("Checking the entry for 70: ");
//		  System.out.println("Value is: " + tree_map1.floorEntry(70));
		  
		  
		  
//		  System.out.println(tm.floorKey(1));
//		  System.out.println(tm.floorKey(9));
		  
		  
//		  System.out.println(tm.headMap(5));
		  
//		  System.out.println(tm.headMap(1, true));
		  
//		  System.out.println(tm.headMap(5,false));
		  
		  
//		  System.out.println(tm.higherEntry(4));
//		  System.out.println(tm.lowerEntry(5));
//		  
//		  System.out.println(tm.lowerKey(5));
//		  System.out.println(tm.lowerEntry(4));
		 
//		System.out.println(tm.navigableKeySet());
//		System.out.println(tm.keySet());
		  
//		  System.out.println(tm);
//		  System.out.println(tm.pollFirstEntry());
//		  System.out.println("after polling\n"+tm);
		  
		  
//		  System.out.println(tm);
//		  System.out.println(tm.pollLastEntry());
//		  System.out.println("after polling\n"+tm);
		  
		  
//		  System.out.println(tm);
////		  tm2 =  tm.subMap(2, 5);
//		  tm2 = tm.subMap(2,true, 5,true);
//		  System.out.println("Sub map key-value Pair\n"+tm2);
		  
//		  System.out.println(tm);
////		  System.out.println(tm.tailMap(2));
//		  System.out.println(tm.tailMap(2,false));
		
		
		System.out.println(tm);
//		System.out.println(tm.ceilingEntry(7));
		System.out.println(tm.ceilingKey(7));
		 
		
		
		
		
		
	}
	
	
}

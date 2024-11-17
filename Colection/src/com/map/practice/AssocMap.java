package com.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AssocMap {


	public static void main(String[] args) {
		HashMap< String, Integer> map = new HashMap<String, Integer>();
		HashMap< String, Integer> map3 = new HashMap<String, Integer>();
		
		map.put("gopi", 1);map.put("lachi", 2); map.put("appa", 3); map.put("amma", 4);
		
//		map3.putAll(map);
		
//		int count = 0;
//		for(Map.Entry<String, Integer> x:map.entrySet() ) {
////			System.out.println(" "+x.getValue());
//		}
////		map.clear();
//		map3 =(HashMap) map.clone();
////		System.out.println(count);
//		System.out.println(map);
//		System.out.println(map3);
		
//		 System.out.println("gopi ?");
//		 if(map.containsKey("Appa")) {
//			 System.out.println("there");
//		 }else {
//			 System.out.println("not  ");
//		 }
		
		
//		Set set = map.entrySet();
//		
//		System.out.println("set values "+ set);
		
		
//		Integer val =  map.get("amma");
//		System.out.println(val);
		
//		Set keyset = map.keySet();
//		System.out.println(keyset);
		
//		System.out.println("values in map is : "+map.values());
		
		
	String str = "gopi";
	HashMap<Character,Integer> fre = new HashMap<Character, Integer>();
	
	str = str.toLowerCase();
	
	char []  st = str.toCharArray();
	
	for(Character c : str.toCharArray()) {
		if(fre.containsKey(c)) {
			fre.put(c, fre.get(c)+1);
		}else {
			fre.put(c,1);
		}
	}
	
	
	for(Map.Entry<Character, Integer> fr: fre.entrySet()) {
		System.out.println(fr.getKey()+":"+fr.getValue());
	}
		
		
		
		
		
	}
}

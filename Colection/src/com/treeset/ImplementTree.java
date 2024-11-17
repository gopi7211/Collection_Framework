package com.treeset;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class ImplementTree {

	public ImplementTree() {
		System.out.println("Hei gaandu");
	}

	public static void main(String[] args) {
		
		TreeSet<Integer> tre = new TreeSet<Integer>
		(Arrays.asList(1,95,22,4,5,90));
		
		System.out.println(tre.size());
		
		Set<Integer> tre1 = new TreeSet<Integer>();
		
		tre1 = (TreeSet)tre.clone();
		
		System.out.println(tre1);
		System.out.println(tre);
		
//		tre.remove(91);
		System.out.println(tre);
		
		
//		System.out.println(tre.pollLast());
//		System.out.println(tre.last());
//		System.out.println(tre.last());
//		System.out.println(tre.pollFirst());
//		System.out.println(tre.isEmpty());
//		
//		System.out.println(tre.lower(90));
//		System.out.println(tre.higher(22));
		
		Iterator<Integer> it = tre.descendingIterator();
		while(it.hasNext()) {
			
				System.out.println(it.next());
			
		}
		TreeSet<Integer> tre2 = new TreeSet<Integer>();
		
		TreeSet<Integer> tre3 = (TreeSet<Integer>)tre.subSet(4, 98);
		
//		Spliterator<Integer> spit = tre.spliterator();
//		spit.forEachRemaining(System.out::print);
//			
		System.out.println(tre.floor(99));
		
		System.out.println(tre3);
		
		
		
	}

}

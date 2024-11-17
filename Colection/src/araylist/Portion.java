package araylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Portion {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList(Arrays.asList(1,4,2,3,5,6));
		
		List l2 = new ArrayList(Arrays.asList(1,4,2,5,6));
		
		ArrayList<Integer> l3 = new ArrayList();
//		List l2 = l1.subList(1, 4);
		for(Integer i : l1) {
			l3.add(l2.contains(i) ? 1 : 0);
		}
		
		System.out.println(l3);
	}
}

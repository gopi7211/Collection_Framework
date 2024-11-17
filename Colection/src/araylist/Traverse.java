package araylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Traverse {

	public static void main(String[] args) {
		List<Integer> l1 =
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		
		for(int i : l1) {
			System.out.print(i);
		}
	}
}

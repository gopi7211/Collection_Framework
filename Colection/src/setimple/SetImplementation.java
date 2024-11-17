package setimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetImplementation {

	public static void main(String[] args) {
		
		Set<Integer> set1= new HashSet<Integer>(
			Arrays.asList(1,2,3,4,5)	
				);
		
		Spliterator<Integer> split = set1.spliterator();
		
		
		split.forEachRemaining((ele)->System.out.print(ele+"-"));
		
		
//		System.out.println(set3);
		
		}

}
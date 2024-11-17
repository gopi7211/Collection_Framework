package QueuePack;

//import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class queueimp {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		Queue<String> queitera = new LinkedList<String>(Arrays.asList("One","Two","Three","Foure","Five","Six"));
		Queue<Integer> qu2 = new PriorityQueue<Integer>();
		st.addAll(queitera);
		
		while (st.isEmpty()==false) {
			System.out.println(st.pop());
		}
		
//		System.out.println(st);
//		st.add("zero");
//		st.add(null);
//		st.add("One");
//		st.add("");
//		st.add();
//		st.add();
//		st.add();
		
		
//		Iterator<Integer> itera = queitera.iterator();
		
		
		
//		while(queitera.isEmpty()==false) {
//			System.out.println( queitera.poll());
//		}
	}
}

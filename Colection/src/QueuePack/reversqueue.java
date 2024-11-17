package QueuePack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class reversqueue {

	public static void main(String[] args) {
		
		Queue<Integer> st = new LinkedList<Integer>();
	
		st.add(1); st.add(2); st.add(3); st.add(4); st.add(5);
		reverseQueue(st);
		System.out.println(st);
		
	}
	
	 static void reverseQueue(Queue<Integer> qu) {
		 Stack<Integer> st = new Stack<>();
		 
		while(!qu.isEmpty()) {
			st.push(qu.poll());
		}
		
		while(!st.isEmpty()) {
			qu.add(st.pop());
		}
	 }
}

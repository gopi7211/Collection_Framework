package QueuePack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


public class priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		ArrayDeque pq2 = new ArrayDeque(Arrays.asList(11,22,33,44));
		PriorityQueue pq3 = new PriorityQueue(Arrays.asList(11,22,33,44,55));
		
		pq.add("zero");
		pq.add("one");
		pq.add("two");
		pq.add("three");
		pq.add("foure");
		pq.add("five");
		pq.add("six");
		pq.add("seven");
		
		pq2.add(11);
		pq2.add(25);
		pq2.add(4);
		pq2.add(3);
		pq2.add(6);
		pq2.add(10);
//		pq2.add("op");
		
		
//		pq.addAll(pq2);	
//		pq.add(pq2);
//		System.out.println(pq2);
		//		System.out.println("elements are :\n"+pq2);
//		System.out.println(pq2.containsAll(pq3));
		
		
//		while (pq2.isEmpty()==false) {
			System.out.println(pq2.pollLast());
//		}
		
		
	}
	}


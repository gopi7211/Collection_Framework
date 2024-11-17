package QueuePack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEquality {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
 
		Queue<Integer> q2 = new LinkedList<>();
		q2.offer(1);
		q2.offer(2);
		q2.offer(3);
 
		Queue<Integer> q3 = new LinkedList<>();
		q3.offer(3);
		q3.offer(2);
		q3.offer(1);
		
		System.out.println(areequal(q1, q2));
		System.out.println(areequal(q1, q3));
	}
	
	static boolean areequal(Queue<Integer> q1,Queue<Integer> q2) {
		
		if(q1.size()!=q2.size()) {
			return false;
		}
		
		Iterator<Integer> it1 = q1.iterator();
		Iterator<Integer> it2 = q2.iterator();
		while(it1.hasNext()) {
			if(!it1.next().equals(it2.next())) {
				return false;
			}
		}
		return true;
	}
}

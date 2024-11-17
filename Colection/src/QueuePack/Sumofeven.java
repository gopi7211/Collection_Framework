package QueuePack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Sumofeven {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Integer sum =0;
		q.add(10);
		q.add(31);
		q.add(3);
		q.add(10);
//		q.add(null);
		q.add(7);
		
		
//		System.out.println(q);
		
		
		Iterator<Integer> it = q.iterator();
		
		for(int i : q) {
//			int nu = it.next();
			if(i%2 ==0 ) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}

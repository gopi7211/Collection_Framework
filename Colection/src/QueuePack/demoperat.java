package QueuePack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class demoperat {

	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<Integer>();
		Queue<Integer> que1 = new PriorityQueue<Integer>();
		Integer max=25;
		que.add(10);
		que.add(20);
		que.offer(50);
		que.add(30);
		que.add(10);
		
		que.add(90);
		que.add(230);
		que.offer(150);
		que.add(304);
		que.add(120);
		
//		que.removeAll();
		
		Iterator<Integer> iter = que.iterator();
		
//		while( iter.hasNext()) {
//			Integer numb = iter.next();
//			if(numb>max) {
//				max = numb;
//			}
//		}
		System.out.println(que1);
	}
}

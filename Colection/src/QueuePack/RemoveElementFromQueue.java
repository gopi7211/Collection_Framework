package QueuePack;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveElementFromQueue {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(20);
		que.offer(40);
		que.offer(20);
		
		int removal = 20;
		
		removefromque(que, removal);
		
		System.out.println(que);
		
	}
	
	static void removefromque(Queue<Integer> que,int removal) {
		
	int size = que.size();
	
	for(int i=0;i<size;i++) {
		int curent = que.poll();
		if(curent != removal) {
			que.offer(curent);
		}
	}
	}
}

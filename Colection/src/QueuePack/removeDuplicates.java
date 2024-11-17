package QueuePack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(2);
		queue.offer(3);
		queue.offer(3);
		queue.offer(3);
		queue.offer(4);
		queue.offer(4);
		queue.offer(4);
		queue.offer(4);
		queue.offer(5);
		queue.offer(5);
		queue.offer(5);
		queue.offer(5);
		queue.offer(5);
		remove_dupli(queue);
		System.out.println(queue);
	}
	
	static void remove_dupli(Queue<Integer> qu) {
		
		Set<Integer> uniqueElements = new HashSet<>();
		int size = qu.size();
 
		for (int i = 0; i < size; i++)
		{
			int element = qu.poll();
			if (!uniqueElements.contains(element))
			{
			qu.offer(element);
			uniqueElements.add(element);
			}
		}
	}
}

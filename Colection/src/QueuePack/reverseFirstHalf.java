package QueuePack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstHalf {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
// 1 2 3 4 5 6
		System.out.println("Original Queue : " + queue);
		rever(queue);
		System.out.println("Queue after reversing first half : " + queue);
	}
	
	static void rever(Queue<Integer> que) {
		int size = que.size();
		
		int half = size/2;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i =0;i<half;i++) {
			stack.push(que.poll());
		}
		
		while(!stack.isEmpty()) {
			que.offer(stack.pop());
		}
//		
		for(int i =0;i< half;i++) {
			que.offer(que.poll());
		}
	}
}

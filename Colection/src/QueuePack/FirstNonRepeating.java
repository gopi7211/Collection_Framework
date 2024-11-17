package QueuePack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeating {

	public static void main(String[] args) {
		
		int num[] = {10,20,20,30,40,40,50};
		int res = findFirstNonRepeating(num);
		
		System.out.println(res);
	}
	
	static int findFirstNonRepeating(int[] arr) {

		Queue<Integer> queue = new LinkedList<Integer>();
		Map<Integer, Integer>  frequency=new HashMap<>();
		
		for(int num : arr) {
			frequency.put(num, frequency.getOrDefault(num, 0)+1);
			queue.offer(num);
		}
		
		while(!queue.isEmpty()) {
			int num= queue.poll();
			if(frequency.get(num) == 1) {
				return num;
			}
		}
		
		return -1;
	}
}

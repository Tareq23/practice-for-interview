package interview_practice.collection.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
	
		
		deque.add(4150);
		deque.add(1450);
		deque.add(2450);
		deque.add(4350);
		deque.add(5450);
		
		deque.addFirst(54);
		
		for(Integer x : deque) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n=================  PriorityQueue  ===================");
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer t1, Integer t2) {
				return t1 > t2 ? 1 : -1;
			}
		});
		
		priorityQueue.add(34);
		priorityQueue.add(134);
		priorityQueue.add(-234);
		priorityQueue.add(-314);
		priorityQueue.add(-34);
		
//		System.out.println(priorityQueue.peek());
		
//		for(Integer x : priorityQueue) {
//			System.out.print(x+" ");
//		}
		
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			System.out.print(priorityQueue.poll()+" ");
		}
		System.out.println();
	}

}

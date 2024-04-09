package interview_practice.collection.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void demo()
	{
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
	
	public static void priorityQueue()
	{
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		pqueue.add(6);
		pqueue.add(1);
		pqueue.add(4);
		
		
		
		System.out.println(pqueue.poll());
		System.out.println(pqueue);
	}
	public static void main(String[] args) {
		
		
		
		/*store customer info based on their order id which one is minimum*/
		Queue<Customer> customersQueue = new PriorityQueue<>();
		
		/*store customer info base their amount which amount is maximum*/
		Queue<Customer> customers = new PriorityQueue<>(new PrioritizeOrderAmount());
		customers.add(new Customer(202, 453.9, "Bob"));
		customers.add(new Customer(32, 431.9, "Rike"));
		customers.add(new Customer(22, 43.9, "Alic"));
		customers.add(new Customer(102, 33.9, "Lam"));
		
		System.out.println(customers);
		System.out.println(customers.poll());
		System.out.println(customers);
	}

}

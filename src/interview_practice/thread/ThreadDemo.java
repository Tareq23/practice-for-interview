package interview_practice.thread;

import java.util.ArrayList;

public class ThreadDemo implements Runnable {

//	@Override
//	public void run() {
//        // Code to be executed in the thread
//    }

	static void method1() {
		Thread th = new Thread("first-thread");

		th.start();

//		System.out.println(th.getName());
//		System.out.println(th.getId());
//		System.out.println(th.getState());
//		System.out.println(th.getPriority());
//		System.out.println(th.getState());

		ThreadRunDemo thRD = new ThreadRunDemo();
		Thread th2 = new Thread(thRD, "tareq23");

		th2.start();

		System.out.println(th2.getName());
		System.out.println(th2.getThreadGroup());
		System.out.println(th2.getPriority());
	}

	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Integer.toBinaryString(32));
		
		new ArrayList<>();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

package interview_practice.thread;

public class ThreadDemo implements Runnable{
	
//	@Override
//	public void run() {
//        // Code to be executed in the thread
//    }

	
	public static void main(String[] args) {
		Thread th = new Thread("first-thread");
		
		th.start();
		
//		System.out.println(th.getName());
//		System.out.println(th.getId());
//		System.out.println(th.getState());
//		System.out.println(th.getPriority());
//		System.out.println(th.getState());
		
		ThreadRunDemo thRD = new ThreadRunDemo();
		Thread th2 = new Thread(thRD,"tareq23");
		
		th2.start();
		
		System.out.println(th2.getName());
		System.out.println(th2.getThreadGroup());
		System.out.println(th2.getPriority());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}

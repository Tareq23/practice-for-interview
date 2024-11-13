package interview_practice.thread.jenkov;


public class ThreadExample {
	
	
	public static class MyThread extends Thread{
		
		@Override
		public void run(){
			System.out.println("My Thread Running.......");
			System.out.println("My Thread Finished");
		}
	}
	
	public static class MyRunnable implements Runnable{
		@Override
		public void run() {
			System.out.println("My Runnable running.......");
			System.out.println("My Runnable finished......");
		}
	}
	
	public static void main(String[] args) {
//		Thread thread = new MyThread();
//		thread.start();
		
//		new MyThread().start();
		
//		new MyRunnable().run();
		
//		new Thread(new MyRunnable()).start();
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " starting....");
				
				
				try {
					Thread.sleep(2000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Runnable finished");
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		new Thread(runnable, "Thread one..").start();
	}
	
	
}

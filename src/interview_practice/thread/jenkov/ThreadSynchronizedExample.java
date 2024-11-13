package interview_practice.thread.jenkov;

public class ThreadSynchronizedExample {

	
	public static class StoppableRunnable implements Runnable{
		
		private boolean stopRequested = false;
		
		public synchronized void requestStop() {
			this.stopRequested = true;
		}
		
		
		public synchronized boolean isStopReqeusted() {
			return this.stopRequested;
		}
		
		private void sleep(long milis) {
			try {
				Thread.sleep(milis);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		@Override
		public void run() {
			System.out.println("Stoppable Runnable running..");
			while( !isStopReqeusted() ) {
				sleep(1000);
				
				System.out.println(".......");
			}
			
			System.out.println("Stoppable Runnable stop");
			
		}
	}
	
	
	public static void main(String[] args) {
		StoppableRunnable stoppableRunnable = new StoppableRunnable();
		Thread thread = new Thread(stoppableRunnable, "The Thread");
		thread.start();
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("requesting stop");
		stoppableRunnable.requestStop();
		System.out.println("stop requested");
	}
}

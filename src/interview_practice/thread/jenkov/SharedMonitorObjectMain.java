package interview_practice.thread.jenkov;

public class SharedMonitorObjectMain {
	
	public static void main(String[] args) {
		Object monitor1 = new Object();
		
		
		SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
		SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);
		
//		smo1.incCounter();
//		smo1.incCounter();
//		smo2.incCounter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 100; i++) {
					smo1.incCounter();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0; i < 100; i++) {
					smo1.decCounter();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println(smo1.getCounter());
		
	}

}

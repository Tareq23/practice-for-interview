package interview_practice.thread.jenkov;

public class SharedMonitorObject {
	
	private Object monitor = new Object();
	
	private int counter = 0;
	public SharedMonitorObject(Object obj) {
		if(obj == null) {
			throw new IllegalArgumentException("Monitor object can not be null");
		}
		
		this.monitor = monitor;
	}
	
	
//	public void incCounter() {
//		synchronized (this.monitor) {
//			this.counter++;
//		}
//	}
	public void incCounter() {
		this.counter++;
//		synchronized (this.monitor) {
//		}
	}
	
	public void decCounter() {
		synchronized (this.monitor) {
			this.counter--;
		}
	}
	
	public int getCounter() {
		return this.counter;
	}

}

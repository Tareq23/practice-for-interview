package interview_practice.thread.jenkov;

public class Counter {
	
	
	private int value = 0;
	
	public void increment() {
		this.value++;
	}
	
	public void decrement() {
		this.value--;
	}
	
	public int getCounterValue() {
		return this.value;
	}

}

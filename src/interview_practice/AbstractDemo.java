package interview_practice;

public abstract class AbstractDemo implements InterfaceA{
	private String title;
	
	
	
	public AbstractDemo() {
		this.title = "Default Title";
		System.out.println("Abstract Constructor called");
	}
	
	public AbstractDemo(String title) {
		this.title = title;
		System.out.println("Abstract Constructor called with "+this.title);
	}
	
//	public abstract int sum(int a, int b);
	
	public final void checkPrime(int num) {
		System.out.println(num+"'s prime check");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}

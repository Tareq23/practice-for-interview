package interview_practice.decouple.without;

public class Calculator {
	
	private Logger logger = new Logger();
	
	public int add(int a, int b) {
		int result = a + b;
		logger.log("Adding "+a+" and "+ b + " equals "+result);
		return result;
	}

	public void display() {
		System.out.println("Checking Display");
	}

}

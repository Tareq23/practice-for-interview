package interview_practice.decouple.with;

public class Calculator {
	private Logger logger;
	public Calculator(Logger logger)
	{
		this.logger = logger;
	}
	
	public int add(int a, int b)
	{
		int result = a + b;
		logger.log("Adding "+a + " and "+b+" equals "+result);
		return result;
	}
	
	public void display() {
		System.out.println("Checking display");
	}
}

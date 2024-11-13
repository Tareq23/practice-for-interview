package interview_practice.decouple;

import interview_practice.decouple.with.ConsoleLogger;
import interview_practice.decouple.without.Calculator;

public class Client {

	public static void main(String[] args) {
		
		//new Calculator().display();
		
		// without decoupling
		Calculator calculator = new Calculator();
		calculator.add(32, 34);
		
		
		
		interview_practice.decouple.with.Calculator cal = new interview_practice.decouple.with.Calculator(new ConsoleLogger());

		cal.add(45, 36);
	}

}

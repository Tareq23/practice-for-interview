package interview_practice.decouple.with;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}

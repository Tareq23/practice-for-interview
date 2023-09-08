package interview_practice.java8.functionalProgramming;

import java.util.function.Consumer;

public class ConsumerInterface {
	
	
	public void practice(String str)
	{
		Consumer<String> cons = s -> {
			System.out.println(s.toUpperCase());
		};
		
		Consumer<String> cons2 = String::length;
		
		cons2.accept(str);
		cons.accept(str);
	}

}

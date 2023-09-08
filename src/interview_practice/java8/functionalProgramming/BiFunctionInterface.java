package interview_practice.java8.functionalProgramming;

import java.util.function.BiFunction;

public class BiFunctionInterface {
	
	public void practice()
	{
		BiFunction<Integer, Integer, Integer> multiply = (a,b) -> a*b;
		
		System.out.println("multiply of 4 and 9 is: "+multiply.apply(4, 9));
	}

}

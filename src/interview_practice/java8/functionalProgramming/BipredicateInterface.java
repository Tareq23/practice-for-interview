package interview_practice.java8.functionalProgramming;

import java.util.function.BiPredicate;

public class BipredicateInterface {

	
	public void practice() {
		BiPredicate<Integer, Integer> bip = (a,b) -> (a*b)>100;
		
		System.out.println("Summation of 23 and 78 is greater than 100 is "+bip.test(23, 78));
	}


}

package interview_practice.java8.functionalProgramming;

import java.util.function.Predicate;

public class PredicateInterface {
	
	
	public void practice(String string)
	{
		Predicate<String> pred = s -> s.length() > 5;
		System.out.println("Is String length greater than 5? Ans: "+pred.test(string));

		
		Predicate<String> evenCheck = s -> s.length() % 2 == 0;
//		Predicate<String> oddCheck = s -> {
//			
//			if(s.length()>5 && s.length()%2==1) return true;
//			return false;
//		};
		Predicate<String> oddCheck = s -> s.length() % 2 == 1;
		System.out.println("after marging with and: Is String length greater than 5 and even? Ans: "+evenCheck.and(pred).test(string));
		System.out.println("after marging with or: Is String length greater than 5 or Odd? Ans: "+oddCheck.and(pred).test(string));
		System.out.println("after marging with negate: Is String length greater than 5 or Odd? Ans: "+oddCheck.and(pred).negate().test(string));
	}

}

package interview_practice.java8.functionalProgramming;

import java.util.function.Function;

public class FunctionInterface {
	
	public void practice(String str)
	{
		Function<String, Integer> fun = s -> s.length();
		
		
		System.out.println("Get string length using funcation interface: "+fun.apply(str));
	}
	
	public void funcationChain(int num)
	{
		Function<Integer,Integer> f1 = n -> ++n;
		Function<Integer,Integer> f2 = n -> n*n;
		Function<Integer,Integer> f3 = n -> n+n;
		Function<Integer,Integer> f4 = n -> n-2*n;
		
		int res = f1.andThen(f2).andThen(f3).andThen(f4).apply(num);
//		int res = f1.andThen(f2).apply(num);
		
		int res2 = f2.compose(f3).apply(num);
		System.out.println("Checking andThen: "+res);
		System.out.println("Checking andThen: "+res2);
	}

}

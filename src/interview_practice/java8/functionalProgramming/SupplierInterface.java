package interview_practice.java8.functionalProgramming;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterface {
	
	
	public void practice()
	{
		Supplier<Date> supl = () -> new Date();
		
		supl.get();
	}

}

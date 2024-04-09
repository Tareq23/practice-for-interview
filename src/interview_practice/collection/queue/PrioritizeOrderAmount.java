package interview_practice.collection.queue;

import java.util.Comparator;

public class PrioritizeOrderAmount implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o2.getAmount() > o1.getAmount() ? 1 : -1;
	}

}

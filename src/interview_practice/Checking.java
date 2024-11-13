package interview_practice;

import java.util.ArrayList;

public class Checking {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		list.add(2);
		list.add(4);
		list.add(5.4f);
		
		Integer sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += (Math.round((float)list.get(i)));
			System.out.println(list.get(i));
		}
		
		int ar[] = {4,5,6,2,10,4,8};
		
		System.out.println(find2ndMax(ar));
		
	}

	
	public static int find2ndMax(int[] ar)
	{
		int firstMax = ar[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 1; i < ar.length; i++)
		{
			if(ar[i] > firstMax) {
				secondMax = firstMax;
				firstMax = ar[i];
			}
			
			if(ar[i] < firstMax && ar[i] > secondMax) {
				secondMax = ar[i];
			}
		}
		return secondMax;
	}
}

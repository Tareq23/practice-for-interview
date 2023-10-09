package interview_practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class SecondMinAndMax {

	
	public static int secondMin(int nums[])
	{
		int fMin = Integer.MAX_VALUE, sMin = Integer.MAX_VALUE;
		
		for(int i=0; i<nums.length; i++)
		{
			if(fMin>nums[i])
			{
				sMin = fMin;
				fMin = nums[i];
			}
			
			if(nums[i]>fMin && sMin>nums[i]) {
				sMin = nums[i];
				System.out.println("FirstMin: "+fMin+" ; SecondMin: "+sMin);
			}
		}
		
		return sMin;
	}
	
	public static void main(String args[])
	{
//		int nums[] = {-4,5,6,9,2,-10,1,20};
		int nums[] = {1,5,1,6,7,2,3,4};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
		PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> Integer.compare(a, b));
		
		for(int i=0; i<nums.length; i++) {
			pq.add(nums[i]);
			pq2.add(nums[i]);
//			pq.offer(nums[i]);
		}
		
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(pq.peek() + " => "+pq2.peek());
			pq.remove();
			pq2.remove();
		}
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
		System.out.println(secondMin(nums));
	}
	
	
}

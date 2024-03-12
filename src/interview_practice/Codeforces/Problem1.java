package interview_practice.Codeforces;

import java.util.Random;

public class Problem1 {

	public static int findMinimum(int[] nums)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		return min;
	}
	
	public static int biggestDifference(int[] nums)
	{
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 10; i++)
		{
			if(min > nums[i]) {
				min = nums[i];
			}
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		
		return (max - min);
	}
	
	public static void main(String[] args) {
		
		
		int[] nums = new int[10];
		for(int i = 0; i < 10; i++)
		{
			nums[i] = new Random().nextInt(0, 101);
		}
		
		
		System.out.println("Minimum Value: "+findMinimum(nums));
		System.out.println("Biggest Difference: "+biggestDifference(nums));
		
	}

}

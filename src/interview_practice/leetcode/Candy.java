package interview_practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Candy {
	
	
	public static int minCandy(int ratings[])
	{

		int[] left = new int[ratings.length];
		int[] right = new int[ratings.length];
		
		left[0] = 1;
		right[ratings.length-1] = 1;
		
		for(int i = 1, j = ratings.length-2; i < ratings.length; i++, j--)
		{
			if(ratings[i] > ratings[i-1]) {
				left[i] = left[i-1] + 1;
			}
			else {
				left[i] = 1;
			}
			
			if(ratings[j] < ratings[j+1]) {
				right[j] = right[j+1] + 1;
			}
			else {
				right[j] = 1;
			}
		}
		
		int res = 0;
		
		for(int i = 0; i < ratings.length; i++) {
			res += Math.max(left[i], right[i]);
		}
		
		return res;
	}
	
	
	public static void main(String args[])
	{
		int ratings[] = {1,0,2};
//							//2 1 2

//		int[] ratings = {1,6,10,8,7,3,2}
		
		System.out.println(minCandy(ratings));
	}

}

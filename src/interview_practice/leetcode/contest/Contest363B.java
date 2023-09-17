package interview_practice.leetcode.contest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Contest363B {
	
	
	public static int countWays(List<Integer> nums) {
		
		
		System.out.println("Int max: "+Integer.MAX_VALUE+" ; Int min: "+Integer.MIN_VALUE+"\nDouble Max "+Double.MAX_VALUE+" ; double max exp: "+Double.MAX_EXPONENT);
		System.out.println("character: "+Character.MAX_VALUE+" ; min: "+Character.MIN_VALUE);
		
		if(Character.MAX_VALUE == ' ')
		{
			System.out.println("space is the max character");
		}
		
        return 2;
    }
	
	 
	public static void main(String[] args)
	{
		List<Integer> nums = List.of(6,0,3,3,6,7,2,7);
		int res = countWays(nums);
		System.out.println(res);
	}

}

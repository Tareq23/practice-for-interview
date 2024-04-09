package interview_practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static int findMaxLength(int[] nums)
	{
		int result = 0;
		int length = nums.length;
		int countOne = 0, countZero = 0;
		int temp = 0;
		for(int i = 0; i < length; i++)
		{
			countOne = 0; countZero = 0;
			for(int j = i; j < length; j++)
			{
				if(nums[j] == 1) countOne++;
				else countZero++;
				
				if(countOne == countZero) {
					result = Math.max(result, j - i + 1);
				}
			}
			
			result = Math.max(temp, result);

		}
		
		return result;
	}
	
	
	public static int optimal(int[] nums)
	{
		int len = nums.length;
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int countOne = 0, result = 0;
		
		for(int i = 0; i < len; i++)
		{
			countOne = nums[i] == 1 ? ++countOne : --countOne;
			
			if(!map.containsKey(countOne)) {
				map.put(countOne, i);
				continue;
			}
			
			result = Math.max(result, i - map.get(countOne));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
//		int[] nums = {1, 1, 0};
		
//		System.out.println(findMaxLength(nums));
		System.out.println(optimal(nums));
		
	}

}

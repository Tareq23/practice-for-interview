package interview_practice.leetcode.slidingWindow;

public class MinimumSizeSubarraySum {
	
	public static int minSubArrayLen(int target, int[] nums) {
        
		
		int res = Integer.MAX_VALUE;
		
		int temp = 0,tempIndex=-1;
		boolean flag = false;
		for(int i=0, startIndex=0; startIndex<nums.length && i <nums.length; )
		{
			if(tempIndex != i) {
				temp += nums[i];				
			}
			
			if(!flag) {
				tempIndex = i;
				flag = true;
			}
			if(temp>=target) {
				temp-=nums[startIndex];
				res = Math.min(res, i-startIndex+1);
				startIndex++;
				tempIndex=i;
			}
			else {
				i++;
			}
			
		}
		
		return res == Integer.MAX_VALUE ? 0 : res;
		
		
    }
	
	public static void main(String args[])
	{
//		int nums[] = {2,3,1,2,4,3}, target = 7;
//		int nums[] = {2,3,1,1,1,4,2,3,4}, target = 7;
		int nums[] = {1,2,3,4,5}, target = 11;
//		int nums[] = {1,4,4}, target = 4;
//		int nums[] = {1,1,1,1,1,1,1,1,1,1}, target = 11;
		
		System.out.println(minSubArrayLen(target, nums));
	}

}

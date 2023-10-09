package interview_practice.leetcode;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
	
	  public static int longestConsecutive(int[] nums) {
		  
		  	if(nums.length == 0) return 0;
	        Arrays.sort(nums);
	        int res=1,cnt=1;
	        for(int i=1,j=0; i<nums.length; i++)
	        {
	            int temp = nums[i]-nums[j];

	            if(temp == 0){
	            	j++;
	                continue;
	            }

	            if(temp == 1)
	            {
	                cnt++;
	                j++;
	            }
	            else{
	                j=i;
	                cnt=1;
	            }

	            res = Math.max(cnt,res);

	        }
	        return res;
	    }
	  
	  public static void main(String args[])
	  {
		  int nums[] = {0,3,7,2,5,8,4,6,0,1};
		  
		  System.out.println(longestConsecutive(nums));
	  }

}

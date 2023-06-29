package interview_practice.leetcode.sorting;

import java.util.Arrays;

public class LeetCode2733 {
	
	
	public int findNonMinOrMax(int[] nums) {

        
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int res=-1;
        for(int i=0; i<nums.length; i++){

            if(nums[i] != min && nums[i] != max){
                res = nums[i];
            }
        }

        return res;
        
    }
	
	public static void main(String[] args) {
		LeetCode2733 obj = new LeetCode2733();
		
		int[] ar = {3,2,1,4};
		
		System.out.println(obj.findNonMinOrMax(ar));
	}

}

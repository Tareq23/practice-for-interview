package interview_practice.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	
	public static int[] productExceptSelf(int[] nums) {
        
		int leftProduct=1,rightProduct=1,leftZero=0,rightZero=0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				rightProduct *= nums[i];
			}
			else {
				rightZero++;
			}
		}
		
		if(rightZero == nums.length) rightProduct=0;
		
		boolean zeroFlag = false;
		for(int i=0; i<nums.length; i++)
		{
			
			
			
			zeroFlag = nums[i] == 0 ;
			int temp = nums[i];
			
			if(!zeroFlag) {
				rightProduct /= temp;
			}
			else {
				rightZero = rightZero > 0 ? --rightZero : 0;
				System.out.println(rightZero);
			}
			
			System.out.println("leftP: "+leftProduct + " temp: "+ temp + " rightP "+rightProduct+" leftZ: "+leftZero+" rightZ: "+rightZero);
			
			nums[i] = leftProduct * rightProduct * (leftZero>0 ? 0 : 1) * (rightZero > 0 ? 0 : 1);
			
			
			if(!zeroFlag) leftProduct *= temp;
			else leftZero++;
		}
		return nums;
    }
	
	public static void main(String args[])
	{
//		int nums[] = {1,2,3,4};
//		int nums[] = {-1,1,0,-3,3};
//		int nums[] = {0,0,0,0};
		int nums[] = {0,3,0};
 		Arrays.stream(productExceptSelf(nums)).forEach(e -> System.out.print(e+" "));
		
		int x = 1,y=-2;
		
//		System.out.println(y/x);
	}

}

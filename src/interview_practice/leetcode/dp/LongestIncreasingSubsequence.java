package interview_practice.leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
		
	public static int lengthOfLIS(int[] nums) {

		int n = nums.length + 1, m = nums.length + 1;

		int[][] dp = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				dp[i][j] = 1;
		}

		dp[0][0] = 0;
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++)
//				System.out.print(dp[i][j]);
//			System.out.println();
//		}

		for (int i = 1; i < n; i++) {
			for (int j = i; j < m; j++) {
				if (nums[j - 1] > nums[i - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					System.out.println("i: "+i+"; j:"+j+"; nums[j-1]: "
					+nums[j-1] + "; nums[i-1]: "+nums[i-1]+"; dp[i][j]: "+dp[i][j]);
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}

//			for (int j = 1; j < m; j++) {
//				System.out.print(dp[i][i] + " ");
//			}
//			System.out.println();
		}

		return dp[n - 1][m - 1];

	}

	
	public static int approach1(int[] nums, int prevIdx, int currIdx) {
		
		if(currIdx >= nums.length) return 0;
		

		
		int res1 = 0, res2 = 0;
		
		if(prevIdx > -1 && nums[currIdx] > nums[prevIdx]) res1 = 1 + approach1(nums, currIdx, currIdx + 1);
		
	    res2 =  0 + approach1(nums, prevIdx , currIdx + 1);
	    
	    return res1 + res2;
	}
	
	public static int approach2(int[] nums)
	{
		int[] mem = new int[nums.length];
		Arrays.fill(mem, 1);
		int res = 1;
		for(int i = 1; i < nums.length; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(nums[i] > nums[j]) {
					mem[i] = Math.max(mem[i], mem[j]+1);
					res = Math.max(mem[i], res);
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
//		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int[] nums = {0,1,0,3,2,3};
		
//		int res = lengthOfLIS(nums);
//		int res = approach1(nums, -1, 0);
		int res = approach2(nums);
		
		System.out.println(res);
		
	}

}

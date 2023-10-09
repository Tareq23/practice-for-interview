package interview_practice.leetcode;

public class JumpGame {

	public static boolean canJump(int index, int[] nums, int mem[]) {

		if (index >= (nums.length - 1) || nums[index] >= nums.length)
			return true;

		if (nums[index] == 0)
			return false;
		if (mem[index] != -1)
			return mem[index] == 1 ? true : false;
		boolean res = false;
		for (int i = nums[index]; i > 0; i--) {
			System.out.println(i);
			res = res | canJump(index + i, nums, mem);
		}
		mem[index] = res == true ? 1 : 0;
		return res;

	}

	public static int minJump(int index, int[] nums, int mem[]) {
		if (index >= (nums.length - 1))
			return 0;
		if (nums[index] >= nums.length)
			return 1;
		if (nums[index] == 0)
			return 10000009;
		if (mem[index] != -1)
			return mem[index];
		int res = 10000009;
		for (int i = nums[index]; i > 0; i--) {
//	        	System.out.println(i);
			res = Math.min(res, 1 + minJump(index + i, nums, mem));
		}
		return mem[index] = res;
	}

	public static void main(String[] args) {

//		int nums[] = {2,3,1,1,4};
//		int nums[] = {2,3,0,1,4};
//		int nums[] = {3,2,1,0,4};
//		int nums[] = {3,0,0,0};
//		int nums[] = {0};
//		int nums[] = {8,2,4,4,4,9,5,2,5,8,8,0,8,6,9,1};
//		int nums[] = {4,8,6,0,3,2,8,7,6,5,1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2};
//		int nums[] = {1,7,0,3,4,8,3,5,9,0,4,0,1,0,5,9,2};
		int nums[] = { 8, 2, 4, 4, 4, 9, 5, 2, 5, 8, 8, 0, 8, 6, 9, 1, 1, 6, 3, 5, 1, 2, 6, 6, 0, 4, 8, 6, 0, 3, 2, 8,
				7, 6, 5, 1, 7, 0, 3, 4, 8, 3, 5, 9, 0, 4, 0, 1, 0, 5, 9, 2, 0, 7, 0, 2, 1, 0, 8, 2, 5, 1, 2, 3, 9, 7, 4,
				7, 0, 0, 1, 8, 5, 6, 7, 5, 1, 9, 9, 3, 5, 0, 7, 5 };

		int mem[] = new int[nums.length + 1];

		for (int i = 0; i <= nums.length; i++)
			mem[i] = -1;

//		System.out.println(canJump(0,nums,mem));
		System.out.println(minJump(0, nums, mem));

	}

}

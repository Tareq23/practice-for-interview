package interview_practice.leetcode.binary_search;

public class LeetCode153 {

	public int findMin(int ar[]) {

		int size = ar.length;

		int low = 0, high = size - 1;

		int res = Integer.MAX_VALUE;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			res = Math.min(res, Math.min(ar[mid], Math.min(ar[low], ar[high])));
			if (ar[mid] > ar[low]) {
				low = mid + 1;
			} else {
				high = mid-1;
			}

		}

		return res;
	}
	
	public static void main(String[] args) {
		LeetCode153 obj = new LeetCode153();
		
//		int[] ar = {0,1,2,3,4,5,6,7};
		int[] ar = {7,0,1,2,3,4,5,6};
//		int[] ar = {6,7,0,1,2,3,4,5};
//		int[] ar = {5,6,7,0,1,2,3,4};
//		int[] ar = {4,5,6,7,0,1,2,3};
//		int[] ar = {3,4,5,6,7,0,1,2};
//		int[] ar = {2,3,4,5,6,7,0,1};
//		int[] ar = {1,2,3,4,5,6,7,0};
		
		// here rotated at 7 times
		
		System.out.println(obj.findMin(ar));
	}

}

package interview_practice.sort;

public class MergeSort {

	public static void divide(int[] nums, int left, int right)
	{
		if(left >= right) return;
		int mid = (left + right) / 2;
		
		divide(nums, left, mid);
		divide(nums, mid+1, right);
		
		conquer(nums, left, mid, right);
	}
	
	
	private static void conquer(int[] nums, int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
//		System.out.println("left: ");
		for(int i = 0; i < n1; i++)
		{
			L[i] = nums[left+i];
			System.out.print(L[i]+" ");
		}
		System.out.println("\nright: ");
		for(int i = 0; i < n2; i++)
		{
			R[i] = nums[mid + 1 + i];
			System.out.print(R[i]+" ");
		}
		System.out.println();
		int i = 0, j = 0, k = left;
		
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j]) {
				nums[k] = L[i];
				i++;
			}
			else {
				nums[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			 nums[k] = L[i];
			 k++;
			 i++;
		}
		while(j < n2) {
			nums[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		
		
		int[] nums = { 6, 5, 12, 10, 9, 1 };
		
		divide(nums, 0, nums.length-1);
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}

	}

}

package interview_practice.sort;

public class HeapSort {

	
	public static void heapify(int[] nums, int n, int index)
	{
		
		int l = index * 2 + 1;
		int r = index * 2 + 2;
		int parentIndex = index;
		
		if(l < n && nums[l] > nums[parentIndex]) {
			parentIndex = l;
		}
		
		if(r < n && nums[r] > nums[parentIndex]) {
			parentIndex = r;
		}
		
		if(parentIndex != index) {
			int temp = nums[index];
			nums[index] = nums[parentIndex];
			nums[parentIndex] = temp;
			heapify(nums, n, parentIndex);
		}
	}
	
	private static void sort(int[] nums)
	{
		int n = nums.length;
		
		//max heap
		for(int i = n/2 - 1; i >= 0; i--)
		{
			heapify(nums, n, i);
		}
		
		for(int i = n - 1; i >= 0; i--)
		{
			int temp = nums[i];
			nums[i] = nums[0];
			nums[0] = temp;
			heapify(nums, i, 0);
		}
	}
	
	public static void main(String[] args) {
		
		
		int nums[] = {48,4,1,4,9,0,21};
		
		sort(nums);
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

}

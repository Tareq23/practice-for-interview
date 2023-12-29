package interview_practice;

public class Checking {
	
	
	
	public static void main(String[] args) {
		
		int ar[] = {4,5,6,2,10,4,8};
		
		System.out.println(find2ndMax(ar));
		
	}

	
	public static int find2ndMax(int[] ar)
	{
		int firstMax = ar[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 1; i < ar.length; i++)
		{
			if(ar[i] > firstMax) {
				secondMax = firstMax;
				firstMax = ar[i];
			}
			
			if(ar[i] < firstMax && ar[i] > secondMax) {
				secondMax = ar[i];
			}
		}
		return secondMax;
	}
}

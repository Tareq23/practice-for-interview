package interview_practice.Codeforces;

import java.util.Scanner;

public class Watermelon{
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] nums = new int[n][2];
		
		for(int i = 0; i < n; i++)
		{
			nums[i][0] = sc.nextInt();
			nums[i][1] = sc.nextInt();
		}
		
		int exit = nums[0][0], enter = nums[0][1];
		
		int capacity = enter, res = enter;
		
		for(int i = 1; i < n; i++)
		{
			int temp = enter - nums[i][0] + nums[i][1];
//			capacity = capacity + temp;
			res = Math.max(temp, res);
			enter = temp;
		}
		
		System.out.println(res);
		
		
	}

}

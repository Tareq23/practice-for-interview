package interview_practice.leetcode;

import java.util.Scanner;

public class FactTrailingZero {
	
	public static int trailingZero(int n)
	{
		int res = 0;
		
		for(int i = 1; i <= n; i++)
		{
			int temp = i;
			
			while(temp % 5 == 0)
			{
				res++;
				temp /= 5;
			}
		}
		
		return res;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(trailingZero(n));
	}

}

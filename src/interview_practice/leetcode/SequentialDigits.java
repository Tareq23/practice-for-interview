package interview_practice.leetcode;

import java.util.Random;
import java.util.Scanner;

public class SequentialDigits {

	
	private static void generate(int n)
	{
		int res = -1;
		while(n > 0)
		{
			res = n % 10;
			n = n / 10;
		}
		
		int temp = res+1;
		
		int mul =  (int) Math.pow(10,  (int)Math.log10(n)) * 10;
		
		System.out.println(mul + " <=> "+temp);
	}
	
	
	public static void main(String[] args) {

//		generate(56);
		
		
		int n = new Scanner(System.in).nextInt();
		
		Random random = new Random();
		
//		random.setSeed(10);
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println(random.nextInt(0, 10));
		}
		

	}

}

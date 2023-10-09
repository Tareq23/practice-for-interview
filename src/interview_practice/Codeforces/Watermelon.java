package interview_practice.Codeforces;

import java.util.Scanner;

public class Watermelon{
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		if(val<=2 || val%2==1) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}

}

package interview_practice.Codeforces;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		boolean flag = true;
		while(num>0)
		{
			long temp = num % 10;
			num /= 10;
			if(temp == 4 || temp == 7) {
				continue;
			}
			flag = false;
		}
		if(flag) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}

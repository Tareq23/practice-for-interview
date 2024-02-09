package interview_practice.Codeforces;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		int cnt = 0;
		while(a <= b) {
			a = a * 3;
			b = b * 2;
			cnt++;
		}
		System.out.println(cnt);
	}

}

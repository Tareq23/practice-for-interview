package interview_practice.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TubeTubeFeed {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int k = sc.nextInt();
		
		while(k>0) {
			int temp = num % 10;
			if(temp == 0) {
				num = num / 10;
				k--;
			}
			else {
				if(temp < k) {
					k -= temp;
					num -= temp;
				}
				else {
					num -= k;
					k  = 0;
				}
			}
		}
		System.out.println(num);
		
	}
}
 
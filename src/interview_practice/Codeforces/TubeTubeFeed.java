package interview_practice.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TubeTubeFeed {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int distress = 0;
		for(int i = 0; i < n; i++)
		{
//			String str = sc.next();
//			String[] ss = str.split(" ");
			
			char op = sc.next().charAt(0);
			int d = sc.nextInt();
			
			if(op == '+') {
				x += d;
			}
			else {
				if(x >= d) {
					x -= d;
				}
				else {
					distress++;
				}
			}
			
		}
		
		System.out.print(x+" "+distress);
		
		
	}
}
 
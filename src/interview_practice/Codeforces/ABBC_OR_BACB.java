package interview_practice.Codeforces;

import java.util.Scanner;

public class ABBC_OR_BACB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test=sc.nextInt();
		
		for(int tt=1; tt<=test; tt++) {

			String s = sc.next();
			
			StringBuffer str = new StringBuffer(s+"B");
			int cnt=0,res=0;
			int flag = 1000000;
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i) == 'A')
				{
					cnt++;
				}
				else {
					flag = Math.min(cnt, flag);
					res += cnt;
					cnt=0;
				}
			}
			System.out.println(res-flag);
		}
		

	}

}

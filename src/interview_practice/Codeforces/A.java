package interview_practice.Codeforces;

import java.util.Scanner;

public class A {
	
	static String swap(String str, int i, int j)
	{
		StringBuffer s = new StringBuffer(str);
		
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);
		
		return s.toString();
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int tt=1; tt<=test; tt++)
		{
			String str = sc.next();
			if(str.equals("abc")) {
				System.out.println("YES");
			}
			else if("abc".equals(swap(str,0,1)) || "abc".equals(swap(str,1,2)) || "abc".equals(swap(str,0,2))) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}

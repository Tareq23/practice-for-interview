package interview_practice.Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A {
	
	public static long minimumBoxes(int[] happiness, int k) {
        
		Arrays.sort(happiness);
		
		long res = 0;
		long cnt = 0;
		for(int i = happiness.length - 1; i >= 0 && k > 0; i--, k--)
		{
			if(happiness[i] - cnt > 0) res += (happiness[i] - cnt);
			
			cnt++;
			
		}
		
        return res;
    }
	
	public static void main(String[] args) {
		
		
		int[] apple = {1,1,1,1};
		int[] capacity = {4,3,1,5,2};
		
		
		System.out.println(minimumBoxes(apple, 2));
		
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		
		for(Integer x : set)
		{
			
		}
		
		int n = sc.nextInt();
		
		String s1 = "I hate it", s2 = "I love it";
		String ss1 = "I hate that", ss2 = "I love that";
		StringBuffer res = new StringBuffer("");
		for(int i = 1; i <= n; i++)
		{
			
			if(res.length() > 0) {
				res.append(" ");
			}
			
			if(i % 2 == 0 && i == n) {
				res.append(s2);
			}
			else if(i % 2 == 1 && i == n) {
				res.append(s1);
			}
			else if(i % 2 == 1) {
				res.append(ss1);
			}
			else {
				res.append(ss2);
			}
		}
		
		System.out.println(res.toString());
		
		
	}

}

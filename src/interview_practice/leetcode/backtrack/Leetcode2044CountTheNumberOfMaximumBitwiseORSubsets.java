package interview_practice.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2044CountTheNumberOfMaximumBitwiseORSubsets {

	public static void subset(int[] ar, List<Integer> list, int idx) {

		if (idx >= ar.length) {
			System.out.println(list);
			return;
		}

		list.add(ar[idx]);
		subset(ar, list, idx + 1);
		list.remove(list.size()-1);
		subset(ar, list, idx + 1);
	}
	
	public static int countMaxOrSubsets(int[] ar, int idx, int or, int maxOr)
	{
		if(idx >= ar.length)
		{
			System.out.println("sum: "+or+" ; maxOr: "+maxOr);
			if(or == maxOr) return 1;
			return 0;
		}
		int r1 =  countMaxOrSubsets(ar, idx + 1, or | ar[idx], maxOr);
		int r2 =  countMaxOrSubsets(ar, idx + 1, or, maxOr);
		
		return r1 + r2;
	}

	public static void main(String[] args) {

		int ar[] = { 3, 2, 1, 5 };
//		int ar[] = {3,1};
//		int ar[] = {2,2,2};

		int maxOr = 0;

		for (int i = 0; i < ar.length; i++) {
			maxOr = Math.max(maxOr | ar[i], maxOr);
		}

		int[] num = new int[1 << 21];
		System.out.println("Maximum OR subsets: " + maxOr + " 1<<18 : " + (1 << 21));
		System.out.println(num[(1 << 21) - 1]);
		
		List<Integer> list = new ArrayList<>();
//		subset(ar,list,0);
		
		System.out.println(countMaxOrSubsets(ar, 0, 0, maxOr));
	}

}

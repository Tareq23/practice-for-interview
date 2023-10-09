package interview_practice.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class HIndex {
	
	public static int hIndex(int citations[]) {
		Arrays.sort(citations);
		
		int res = 0;
		
		for(int i=0; i<citations.length; i++)
		{
			if(citations[i] >= (citations.length-i)) {
				res = Math.max(res, citations.length-i);
			}
		}
		return res;
	}
	
	
	public static void main(String args[])
	{
//		int citations[] = {3,0,6,1,5};
		int citations[] = {0,1,3,5,6};
		
		
		System.out.println(hIndex(citations));
	}

}

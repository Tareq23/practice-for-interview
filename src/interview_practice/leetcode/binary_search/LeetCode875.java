package interview_practice.leetcode.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode875 {
	
	
	public int minEatingSpeed(int[] piles, int h) {

		
		Arrays.sort(piles);
        
        
        int res = piles[piles.length-1], low=0,high=piles[piles.length-1];
        
        int k = res;
        
        while(low<=high) {
        	
        	
        	System.out.println();
        	
        	int hour = h;
        	for(int i=0; i<piles.length; i++)
        	{
        		double temp = Math.ceil((double)piles[i]/k);
        		
        		hour = hour - (int)temp;
        		
        		System.out.println("hour decrease :"+hour+" == temp value: "+temp+" k value: "+k);
        	}
        	
        	int mid = low + (high-low)/2;
        	
        	if(hour<0) {
        		low = mid+1;
        		k=low;
        	}
        	else {
        		res = k;
        		high = mid;
        		k=high;
        		System.out.println("result track: "+res);
        	}
        	
        	
        }
        
        return (int) res;
        
    }

	public static void main(String[] args) {
		
		LeetCode875 obj = new LeetCode875();
		
//		int ar[] = {3,6,7,11};
//		int ar[] = {64};
		int ar[] = {30,11,23,4,20};
		int h=6;
		System.out.println(obj.minEatingSpeed(ar, h));
//		double d = Math.ceil(4.0/23);
		
//		System.out.println( d*23);
//		System.out.println(Math.ceil(4.0/23));
//		System.out.println(Math.floor(1.0/2));
	}

}

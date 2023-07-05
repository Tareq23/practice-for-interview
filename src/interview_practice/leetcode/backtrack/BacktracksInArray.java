package interview_practice.leetcode.backtrack;

import java.util.Scanner;

public class BacktracksInArray {

	
	public static void backtrack(int ar[], int index) {
		
		if(index == ar.length) {
			printArray(ar);
			return;
		}
		
		ar[index] = index+1;
		
		backtrack(ar, index+1);
		
		ar[index] -= 2;
		
	}
	
	
	public static void printArray(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int ar[] = new int[n];
		
		backtrack(ar,0);
		
		printArray(ar);
		
		sc.close();
		
	}
	
}

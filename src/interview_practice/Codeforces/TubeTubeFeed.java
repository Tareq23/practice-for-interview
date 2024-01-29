package interview_practice.Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TubeTubeFeed {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int res = 0;
		
		int[][] mat = new int[5][5];
		int row = 0, col = 0;
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] == 1)
				{
					row = i;
					col = j;
				}
			}
		}
		if(col <= row)
		System.out.println(Math.abs(row-col));
	}
}
 
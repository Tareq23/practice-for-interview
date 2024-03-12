package interview_practice.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitwiseAndOfNumbersRange {

	private static List<Integer> bitGenerate(int n)
	{
		List<Integer> list = new ArrayList<>();
		
		while(n != 0)
		{
			list.add((n&1));
			n = n >> 1;
		}
		
		return list;
	}
	
	public static int rangeBitwiseAnd(int left, int right) {
        
		List<Integer> leftBits = bitGenerate(left);
		List<Integer> rightBits = bitGenerate(right);
		for(int i = leftBits.size(); i < rightBits.size(); i++) leftBits.add(0);
		int sum = 0;
		for(int i = rightBits.size() - 1; i >= 0; i--)
		{
//			System.out.println(rightBits.get(i) + " "+leftBits.get(i));
			
			if(rightBits.get(i) == leftBits.get(i)) {
				sum += (1 << i);
				continue;
			}
			break;
		}
		
		return sum;
		
		
		
    }
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = 4;
		int y = 7;
		int andValue = x & y;
//		System.out.println(build(x,y));
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		int res  = rangeBitwiseAnd(x, y);
		System.out.println("Final result: "+res);
		
	}

}

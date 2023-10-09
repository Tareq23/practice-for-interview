package interview_practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Candy {
	
	
	public static int minCandy(int ratings[])
	{
		
		
//		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
//		ArrayList<Integer> lst = new ArrayList<>();
//		lst.add(2);
//		list.add(lst);
		
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(List.of(1,1,1));
		
		
		int res = 0;
		
		int i=0, n = ratings.length;
		
		return res;
	}
	
	
	public static void main(String args[])
	{
		int ratings[] = {1,0,1};
//		int ratings[] = {1,2,2};
		
		System.out.println(minCandy(ratings));
	}

}

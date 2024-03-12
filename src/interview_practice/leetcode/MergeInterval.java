package interview_practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

	private static class Pair{
		int first;
		int second;
		Pair(int _first, int _second){
			this.first = _first;
			this.second = _second;
		}
	}
	
	public static int[][] mergeInterval(List<Pair> intervals)
	{
		
		int first = intervals.get(0).first, second = intervals.get(0).second;
		
		List<Pair> res = new ArrayList<>();
		
		for(int i = 1; i < intervals.size(); i++)
		{
			if(second >= intervals.get(i).first) {
				second = intervals.get(i).second;
			}
			else {
				res.add(new Pair(first,second));
				first = intervals.get(i).first;
				second = intervals.get(i).second;
			}
		}
		
		res.add(new Pair(first, second));
		
		int[][] ans = new int[res.size()][2];
		for(int i = 0; i < res.size(); i++)
		{
			ans[i][0] = res.get(i).first;
			ans[i][1] = res.get(i).second;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
//		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] intervals = {{1,3},{0, 23}};
		
//		Arrays.sort(intervals);
		
		List<Pair> list = new ArrayList<>();
		
		
		for(int i = 0; i < intervals.length; i++)
		{
			list.add(new Pair(intervals[i][0], intervals[i][1]));
		}
		
//		list.sort((e1, e2)->{
//			return e2.first < e1.first ? 1 : -1;
//		});
		
		list.sort(Comparator.comparingInt((Pair item) -> item.first).reversed());
		
		int[][] res = mergeInterval(list);
		
		for(int i = 0; i < res.length; i++)
		{
			System.out.println("("+res[i][0]+","+res[i][1]+")");
		}
		
//		for(Pair pair : list) {
//			System.out.println(pair.first+" "+pair.second);
//		}

	}

}

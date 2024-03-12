package interview_practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	
	private static class Pair{
		int first;
		int second;
		Pair(int _first, int _second){
			first = _first;
			second = _second;
		}
	}

	public static void main(String[] args) {
		
		
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval = {0,8};
		
		List<Pair> list = new ArrayList<>();
		
		for(int i = 0; i < intervals.length; i++)
		{
			list.add(new Pair(intervals[i][0], intervals[i][1]));
		}
		int tempIndex = list.size();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).first <= newInterval[0]) {
				tempIndex = i+1;
				System.out.println(list.get(i).first+","+newInterval[0]);
			}
			if(list.get(i).first > newInterval[0]) {
				tempIndex = i;
				break;
			}
		}
		System.out.println(tempIndex);
		list.add(tempIndex, new Pair(newInterval[0], newInterval[1]));
		
		List<Pair> ans = new ArrayList<>();
		
		int first = list.get(0).first, second = list.get(0).second;
		
		for(int i = 1; i < list.size(); i++)
		{
			if(second >= list.get(i).first) {
				second = Math.max(second, list.get(i).second);
			}
			else {
				ans.add(new Pair(first, second));
				first = list.get(i).first;
				second = list.get(i).second;
			}
		}
		ans.add(new Pair(first, second));
		
		
		for(int i = 0; i < ans.size(); i++)
		{
			System.out.print("("+ans.get(i).first+","+ans.get(i).second+")");
		}
		
		System.out.println(ans.size());
		
//		System.out.println(list.size());
		
	}

}

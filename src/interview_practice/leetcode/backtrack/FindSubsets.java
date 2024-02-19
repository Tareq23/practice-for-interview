package interview_practice.leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSubsets {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void findSubset(String str, String ans, int i) {
		if(i == str.length()) {
			if(ans.isEmpty()) {
				System.out.println("null");
			}
			else {
				System.out.println(ans);				
			}
			return;
		}
		findSubset(str, ans+str.charAt(i), i+1);
		findSubset(str, ans, i+1);
	}
	
	private static void subset(int[] nums, int index, List<Integer> list, List<List<Integer>> ans)
	{
		ans.add(new ArrayList<>(list));
//		System.out.print("printed set: ");
//		for(int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		sc.next();
		if(index < nums.length) {
			
			for(int i = index ; i < nums.length; i++)
			{
				if(i != index && nums[i] == nums[i-1]) {
//					System.out.println("index: "+index+"; i: "+i);
//					sc.next();
					continue;
				}
				list.add(nums[i]);
//				System.out.println("added: "+nums[i]);
				subset(nums, i+1,list, ans);
//				System.out.println("removed: "+list.get(list.size()-1));
				list.remove(list.size()-1);
			}
			
		}
	}
	
	public static void main(String[] args) {
//		String str = "abcd";
//		
//		findSubset(str,"",0);
		
		int[] nums = {1,2,2,3,3};
		List<List<Integer>> ans = new ArrayList<>();
		subset(nums,0, new ArrayList<>(), ans);
		
		for(List<Integer> list: ans) {
			System.out.print("subset: ");
			for(int i : list) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

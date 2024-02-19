package interview_practice.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {

	public static void fun() {
		Map<Integer, Integer> hMap = new HashMap<>();
		Map<Integer, Integer> hTable = new Hashtable<>();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x;
			x = sc.nextInt();

			if (hMap.containsKey(x)) {
				System.out.println("value already exists");
				hMap.put(x, x * x * x);
				hTable.put(x, x * x * x);
			} else {
				hMap.put(x, x * x);
				hTable.put(x, x * x);
			}
		}

		System.out.println(hMap.get(2));

		System.out.println(hMap);
		System.out.println(hTable);
	}

	public static void addList() {
		Map<Integer, List<Integer>> hm = new HashMap<>();
		
		hm.put(-1, new ArrayList<>());
		System.out.println(hm.get(-1).size());
		hm.get(-1).add(45);
		System.out.println(hm.get(-1).size());
	}
	public static void main(String args[]) {
//		addList();
		
		int[] nums = {-2, -4, -5, 6, 2, -19, 3, 10};
		int res = Integer.MIN_VALUE, temp = 0;
		for(int i = 0; i < nums.length; i++)
		{
			temp += nums[i];
			if(temp < nums[i]) temp = nums[i];
			res = Math.max(res,temp);
		}
		System.out.println(res);
	}

}
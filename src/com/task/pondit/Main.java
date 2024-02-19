package com.task.pondit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void wordFrequency() {
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		for(int i = 0; i < strArr.length; i++)
		{
			if(hm.containsKey(strArr[i])) {
				hm.put(strArr[i], hm.get(strArr[i]) + 1);
			}
			else {
				hm.put(strArr[i], 1);
			}
		}
		hm.forEach((key, val)->{
			System.out.println(key+" -> "+val);
		});

	}
	

	public static void findCommonWord()
	{
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String[] strArr1 = str1.split(" ");
		String[] strArr2 = str2.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		for(String ss : strArr1) {
			map.put(ss, 1);
		}
		
		for(String ss : strArr2) {
			map.put(ss, map.containsKey(ss) ? (map.get(ss) == 1 ? 2 : 0) : 0);
		}
		
		map.forEach((key, val)->{
			if(val == 2) {
				System.out.print(key+" ");
			}
		});
		
	}
	
	public static void twoSum() {
		int[] nums = {3,2,4,5,6,7};
		int target = 9;
		
		
	}
	
	public static void main(String[] args) {
		
		findCommonWord();
		
	}

}

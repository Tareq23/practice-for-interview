package interview_practice.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
	
	public static void main(String args[])
	{
		Map<Integer, Integer> hMap = new HashMap<>();
		Map<Integer, Integer> hTable = new Hashtable<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int x;
			x = sc.nextInt();
			
			if(hMap.containsKey(x)) {
				System.out.println("value already exists");
				hMap.put(x, x*x*x);
				hTable.put(x, x*x*x);
			}
			else {
				hMap.put(x, x*x);
				hTable.put(x, x*x);
			}
		}
		
		
		
		System.out.println(hMap.get(2));
		
//		for(Map.Entry m : hMap.entrySet()) {
//			System.out.println(m.getKey()+" => "+m.getValue());
//		}
		
		System.out.println(hMap);
		System.out.println(hTable);
	}

}

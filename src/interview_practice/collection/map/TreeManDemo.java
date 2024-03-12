package interview_practice.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeManDemo {

	
	public static void main(String[] args) {
		Map<Integer, Integer> treeMap = new TreeMap<>();
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		treeMap.put(3, 43);
		treeMap.put(32, 43);
		treeMap.put(13, 143);
		treeMap.put(23, 433);
//		treeMap.put(null, 433); tree map does not support null value but hash map support
		
		hashMap.put(3, 43);
		hashMap.put(32, 43);
		hashMap.put(13, 143);
		hashMap.put(23, 433);
		hashMap.put(null, 433);
		
		for(Map.Entry<Integer, Integer> value : treeMap.entrySet()) {
			System.out.println(value.getKey() + " => "+value.getValue());
		}
		System.out.println("+++++++++++++++  tree map  vs hash map +++++++++++++++");
		for(Map.Entry<Integer, Integer> value : hashMap.entrySet()) {
			System.out.println(value.getKey() + " : "+value.getValue());
		}
	}
	
}

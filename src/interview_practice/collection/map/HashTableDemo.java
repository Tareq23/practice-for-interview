package interview_practice.collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> hashTable = new Hashtable<>();
		
		hashTable.put(45,56);
		hashTable.put(45,52);
		hashTable.put(45,51);
		System.out.println(hashTable.get(45));
		
		
	}
	
}

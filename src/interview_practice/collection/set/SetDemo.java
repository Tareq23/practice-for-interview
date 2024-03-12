package interview_practice.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		hashSet.add(54);
		hashSet.add(154);
		hashSet.add(254);
		hashSet.add(534);
		hashSet.add(554);
		hashSet.add(54);
		hashSet.add(2);
		
		treeSet.add(54);
		treeSet.add(154);
		treeSet.add(254);
		treeSet.add(534);
		treeSet.add(554);
		
		for(Integer x : hashSet) {
			System.out.print(x+" ");
		}
		
		System.out.println("\n+++++++++++++++++++  hash set vs tree set ++++++++++++++++++");
		for(Integer x : treeSet) {
			System.out.print(x+" ");
		}

	}

}

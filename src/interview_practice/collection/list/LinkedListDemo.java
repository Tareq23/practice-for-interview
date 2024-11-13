package interview_practice.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	
	public static void main(String[] args) {
		
		
		Collection<Integer> coll = new ArrayList<>();
		coll.addAll(List.of(1,2,3,4,5,4));
		
		Collections.addAll(coll, 43,2,145,5,6);
		System.out.println(coll);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(45);
		list.add(43);
		list.add(33);
		list.set(0, null);
		System.out.println(list.get(0));
	}

}

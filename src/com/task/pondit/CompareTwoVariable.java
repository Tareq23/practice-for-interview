package com.task.pondit;

public class CompareTwoVariable<T extends Comparable<T>> {
	
	public T compare(T x, T y) {
		return x.compareTo(y) >= 0 ? x : y;
	}
	
	
	
	
	public static void main(String[] args) {
		CompareTwoVariable<Integer> intCheck = new CompareTwoVariable<>();
		
		int max = intCheck.compare(5, 6);
		System.out.println(max);
		
		CompareTwoVariable<String> strCheck = new CompareTwoVariable<>();
		System.out.println(strCheck.compare("this", "aaaa"));
	}
	
}

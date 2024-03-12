package com.task.pondit.generics;


public class EvenOdd<T extends Number>{
	
	private T[] objects =(T[]) new Object[10];
	
	private int  index;
	
	public void add(T value) {
		objects[index++] = value;
	}
	
	private void getSum()
	{
		
	}

}

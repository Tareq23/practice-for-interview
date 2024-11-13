package com.task.pondit.generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	String name;
	public Vehicle(String name)
	{
		this.name = name;
	}
	public String toString() {
		return "[ "+this.name+" ]";
	}
}

class Car extends Vehicle{
	String name;
	
	public Car(String name)
	{
		super(name);
		this.name = name;
	}
}

class Bike extends Vehicle{
	String name;
	public Bike(String name)
	{
		super(name);
		this.name = name;
	}
	
	
}


class Honda extends Bike{
	String name; 
	public Honda(String name)
	{
		super(name);
		this.name = name;
	}
}




public class Main {
	
	// Upper bound Wild Card 
	public static void deleteBike(List<? extends Bike> list, Bike b) {
		list.remove(b);
		System.out.println("Remove: "+b.toString());
	}
	
	// lower bound wild card
	public static void addBike(List<? super Honda> list, Honda b) {
		list.add(b);
		System.out.println("Add: "+b.toString());
	}
	
	// unbounded wild card
	public static void printAll(List<?> list) {
		System.out.println("Print all: [\n ");
			
		 	for(Object t : list)
		 	{
		 		System.out.println("\t"+t);
		 	}
		
		System.out.println("\n ]");
	}

	public static void main(String[] args) {
		
		
		List<Vehicle> vList = new ArrayList<>();
		vList.add(new Vehicle("Hanif"));
		
		
		List<Car> cList = new ArrayList<>();
		cList.add(new Car("BMW"));
		
		List<Bike> bList = new  ArrayList<>();
		bList.add(new Bike("Easy Bike"));
		
		List<Honda> hList = new ArrayList<>();
		hList.add(new Honda("Hero"));
		Honda honda = new Honda("suzuki");
		addBike(hList, honda);
		deleteBike(hList, new Honda("suzuki"));
		printAll(hList);
		
		
		
		
		
		
		
		
		
		
	}

}

package com.task.pondit.uml;

public class Main {

	public static void main(String[] args) {
		
		Location location = new Location(2,6);
		
		Shape circle = new Circle(location, 5);
		Shape rectangle = new Rectangle(location, 5, 6);
		
		System.out.println(rectangle.toString());

	}

}

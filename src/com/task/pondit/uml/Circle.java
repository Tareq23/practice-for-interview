package com.task.pondit.uml;

public class Circle extends Shape {
	
	
	private double radius;

	public Circle() {}
	
	public Circle(Location location, double radius) {
		super(location);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getLocation()=" + getLocation()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}

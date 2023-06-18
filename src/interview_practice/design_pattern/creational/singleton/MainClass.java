package interview_practice.design_pattern.creational.singleton;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		
		SingletonClass obj1 = SingletonClass.getInstance();
		
		
		obj1.simpleMethod();
		
		SingletonClass obj2 = SingletonClass.getInstance();
		
		obj2.simpleMethod();
		
		
	}

}

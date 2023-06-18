package interview_practice.design_pattern.creational.singleton;

public class SingletonClass {
	
	private static SingletonClass singletonInstance = new SingletonClass();
	
	private SingletonClass() {
		// private construct is created because you cann't instance object of the new keyword
	}
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	
	public void simpleMethod() {
		System.out.println("hashCode of singleton object: "+singletonInstance);
	}

}

package interview_practice.java8;

public interface InterfaceDemo {
	
	
	default void printInfoWithDefault() {
		System.out.println("Print Info method");
	}
	
	void printInfoWithoutDefault();
	
	

}

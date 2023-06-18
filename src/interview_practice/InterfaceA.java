package interview_practice;

public interface InterfaceA {
	
	public  String interfaceTitle="Interface A";
	
	public void method1();
	
	default public int subtract(int a, int b) {
		return a-b;
	}
	
	public static void staticMethod() {
		System.out.println("static method in interface");
	}

}

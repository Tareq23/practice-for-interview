package interview_practice.design_pattern.structural.proxy;

public class ClientClass {
	
	
	public static void main(String[] args) {
		
		Subject proxy = new ProxyClass();
		
		proxy.method(false);
		
		Subject proxy2 = new ProxyClass();
		proxy2.method(true);
		
	}

}

package interview_practice.design_pattern.structural.proxy;

public class ProxyClass extends RealSubjectClass{
	
	
	@Override
	public void method(boolean isAuthenticate) {
		
		
		System.out.println("Hi i'm proxy, I will perform authentication and security checks");
		
		// Logic to check if user is authenticated or not. If yes then call real object method
		// else don't call bellow method
		
		if(isAuthenticate) {
			System.out.println("Calling real method of real subject implementation class after the call is authenticate");
			super.method(isAuthenticate);
		}
	}

}

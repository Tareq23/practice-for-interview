package interview_practice.design_pattern.structural.proxy;

public class RealSubjectClass implements Subject{
	
	
	@Override
	public void method(boolean isAuthenticate) {
		System.out.println("I am actual implemention of subject, rest all are proxies : D");
	}

}

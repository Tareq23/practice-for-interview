package interview_practice;



class parentClass{
	int sum(int a,int b) {
		return a+b;
	}
}

class child1 extends parentClass{
	int sum(int a, int b) {
		return 2*a+b;
	}
}

class child2 extends parentClass{
	
}

class check extends AbstractDemo{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}



public class ImpAbstract extends AbstractDemo{
	
	private String impAbstractChecking;

	public ImpAbstract(String title) {
		
		super(title);
		this.impAbstractChecking = title;
		// TODO Auto-generated constructor stub
	}

	public int sum(int a, long b) {
		System.out.println("flag0");
		return (int) (a+b);
	}
	
//	public int sum(long a, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
	public int sum(int a, Long b) {
		System.out.println("flag1");
		return (int) (a+b);
	}
	
	
	public int sum(int a, long b, long c) {
		System.out.println("flag2");
		return (int) (a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		
		
		parentClass obj3 = new child1();
		
		parentClass obj2 = new child2();
		
		System.out.println("obj1 "+obj3.sum(2, 2));
		
		System.out.println("obj2 "+obj2.sum(2, 2));
		
		
		ImpAbstract obj1 = new ImpAbstract("Ok checking");
		
		obj1.checkPrime(10);
		
		int sum = obj1.sum(0, 1);
		
//		System.out.println(obj1.getTitle());
		
//		System.out.println("interface title : "+obj1.interfaceTitle);
//		
//		System.out.println("subtract method from interface "+obj1.subtract(23, 4));
//		InterfaceA.staticMethod();
//		System.out.println();
	}


	@Override
	public void method1() {

		
		
	}
	
	@Override
	public int subtract(int a, int b) {
		return a*a - b+b;
	}

	
}

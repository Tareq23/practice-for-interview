package interview_practice.polymorphism;

public class Main {
	
	public void add(int a, Long b) {
		System.out.println("Sum of two number "+(a+b));
	}
	
	public int add(Long a, Long b) {
		System.out.println("Sum of two number "+(a+b));
		return 0;
	}

	public int add(int... numbers) {
		int sum=0;
		
		for(int x : numbers) {
			sum+=x;
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		Main obj1 = new Main();
		
//		obj1.add(5, 6L);
//		obj1.add(3L, 4L);
//	    System.out.println("add multiple number : "+	obj1.add(1,2,3,4,5));
		
		Person obj;
		obj = new Employee();
		obj.displayInfo();
		
		obj = new Customer();
		obj.displayInfo();
	}

}

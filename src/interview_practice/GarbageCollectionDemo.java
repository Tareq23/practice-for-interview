package interview_practice;

public class GarbageCollectionDemo {
	
	public GarbageCollectionDemo gcd;
	
	public static void main(String[] args) {
		
		
		System.out.println("Garbage Collection");
		
		GarbageCollectionDemo gcd = new GarbageCollectionDemo();
		
//		gcd = null;
		
//		System.gc();
		
		
		GarbageCollectionDemo gcd1 = new GarbageCollectionDemo();
		
		GarbageCollectionDemo gcd2 = new GarbageCollectionDemo();
		
		gcd1.gcd = gcd2;
		
		gcd2.gcd = gcd1;
		
		gcd1 = null;
		gcd2 = null;
		
		
		
		Runtime.getRuntime().gc();
		
		System.out.println("Main method is done");
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
	}
	
	

}

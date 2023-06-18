package interview_practice;

public class StringDemo {

	
	
	public static void main(String[] args) {
		String s1 = new String("code");
		
		s1.intern();
		String s2 = "code";
		
		String s3 = "code";
		
		if(s1==s2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(s2==s3) {
			System.out.println("s2 is equal s3");
		}
		else {
			System.out.println("s3 is not equal s2");
		}
		
		if(s1.equals(s3)) {
			System.out.println("using equal methods: "+s1.equals(s3));
		}
		
		System.out.println("s3 string hashcode before changes : "+s3.hashCode());
		s3 = s3 + " decode";
		System.out.println("s3 string hashcode after changes  : "+s3.hashCode());
		
		System.out.println("s2 string hashcode  : "+s2.hashCode());
//		s1 = null;
		System.gc();
		
		if(s2==s3) {
			System.out.println("s2 is equal s3");
		}
		else {
			System.out.println("s3 is not equal s2");
		}
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.append("Tarequl");
		System.out.println(sb1.hashCode());
		sb1.append(" Islam");
		System.out.println(sb1.hashCode());
		System.out.println("string buffer : "+sb1);
		
		StringBuilder sb2 = new StringBuilder("Hello ");
		
		sb2.append("world");
		
		System.out.println("string builder : "+sb2);
		
		
		
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Successfully removed garbage collection");
	}
	
	
	
}

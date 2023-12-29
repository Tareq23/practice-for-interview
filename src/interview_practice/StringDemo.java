package interview_practice;

import java.util.stream.Stream;



public class StringDemo {

	
	
	public static void split() {
		
//		String str = "//home/out/home//";
		String str = "/dn/a/./b/./c/./d///";
		
		String strArr[] = str.split("/");
		
		System.out.println(strArr.length);
		final int temp=0;
		Stream.of(strArr).forEach(e -> System.out.println(e+" => "+temp));
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		split();
		
		
		
		
/*		String s1 = new String("code");
		
		
		char chArr[] = s1.toCharArray();
		
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
		
		
		String subS = "tareq";
		
		System.out.println("substring: "+subS.substring(0));
		System.out.println("substring: "+subS.substring(0, 1));
		System.out.println("substring: "+subS.substring(0, 2));
		System.out.println("substring: "+subS.substring(2, subS.length()));
		System.out.println(subS.charAt(0));*/
		
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Successfully removed garbage collection");
	}
	
	
	
}

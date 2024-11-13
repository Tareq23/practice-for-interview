package interview_practice.string;

public class StringPoolCheck {

	public static void main(String[] args) {
		
//		String s1 = "kdjfd";
//		String s2 = "kdjfd";
		String s3 = new String("kdjfd");
		String s4 = new String("kdjfd");
		
//		System.out.println(s1.hashCode()+" ; "+s2.hashCode());
		System.out.println(s3.hashCode() + " : "+s4.hashCode());
		
	}

}

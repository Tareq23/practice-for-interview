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
		
		int  j = 0;
		
		String s = "aabcbbca";
		
		StringBuffer str = new StringBuffer(s);
		StringBuffer tempStr = new StringBuffer("");
		while(true)
		{
			j = 0;
			for(int i = 0; i < str.length(); i++)
			{
				if(str.charAt(i) == ('a'+j)) {
					j++;
				}else {
					tempStr.append(str.charAt(i));
				}
			}
			str.replace(0, str.length()-1, tempStr.toString());
			tempStr.delete(0, tempStr.length());
			System.out.println(str);
			if(j == 0) {
				break;
			}
		}
		
		System.out.println(tempStr);

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Successfully removed garbage collection");
	}
	
	
	
}

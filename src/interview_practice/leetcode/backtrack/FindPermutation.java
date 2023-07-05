package interview_practice.leetcode.backtrack;

public class FindPermutation {
	
	
	public static void findPermutation(String str, String ans) {
		
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			
			String newStr = str.substring(0,i) + str.substring(i+1);
			findPermutation(newStr, ans+temp);
		}
		
	}

	public static void main(String[] args) {
		
		
		String str = "abcd";
		
		findPermutation(str, "");

	}

}

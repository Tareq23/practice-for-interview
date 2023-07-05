package interview_practice.leetcode.backtrack;

public class FindSubsets {
	
	
	public static void findSubset(String str, String ans, int i) {
		if(i == str.length()) {
			if(ans.isEmpty()) {
				System.out.println("null");
			}
			else {
				System.out.println(ans);				
			}
			return;
		}
		findSubset(str, ans+str.charAt(i), i+1);
		findSubset(str, ans, i+1);
	}
	
	public static void main(String[] args) {
		String str = "abcd";
		
		findSubset(str,"",0);
	}

}

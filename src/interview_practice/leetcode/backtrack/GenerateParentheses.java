package interview_practice.leetcode.backtrack;

public class GenerateParentheses {

	public static void generateParentheses(String str, int idx) {
		
		if(idx >= str.length()) return ;
		
		System.out.print(str.charAt(idx)+" ");
		generateParentheses(str, idx+1);
		System.out.println("\n back: "+str.charAt(idx));
	}

	public static void main(String[] args) {

		int n = 3;
		StringBuffer str = new StringBuffer("");

		for (int i = 0; i < n; i++)
			str.append('(');
		for (int i = 0; i < n; i++)
			str.append(')');

//		System.out.println(str);
		generateParentheses(str.toString(),0);
	}

}

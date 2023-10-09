package interview_practice.leetcode.string;

public class RepeatedStringMatching {
	
	public static int repeatedStringMatch(String a, String b) {
		
		int n = a.length(), m = b.length();
		
		int div = (int) Math.ceil((double)m/n);
		
		
		StringBuffer str = new StringBuffer(b+"#");
		
		for(int i=0; i<=div ; i++) str.append(a);
		
		System.out.println(str);
		
		int pi[] = new int[str.length()];
		
		for(int i=1; i<str.length(); i++) {
			int j = pi[i-1];
			
			while(j>0 && str.charAt(i) != str.charAt(j)) {
				j = pi[j-1];
			}
			
			if(str.charAt(i) == str.charAt(j)) j++;
			
			pi[i] = j;
			
			if(pi[i] == b.length()) {
				return (int) Math.ceil((double)(i+1-b.length()-1) / a.length());
			}
			
		}
		
        return -1;
    }

	public static void main(String[] args) {
		
		
		String a = "abcd";
		String b = "cdabcdab";
//		String a = "a";
//		String b = "aa";
		
		System.out.println(repeatedStringMatch(a, b));
	}

}

package interview_practice.leetcode.string;

import java.util.Arrays;

public class ShuffleString {
	
	
	public static String shuffle(String s, int indices[])
	{
		String res = "";
//		Arrays.sort(indices);
		
		for(int i=0; i<indices.length; i++) {
			for(int j=0; j<indices.length; j++)
			{
				if(indices[j] == i) {
					res += s.charAt(j);
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		String str = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		
		System.out.println(shuffle(str, indices));
	}

}

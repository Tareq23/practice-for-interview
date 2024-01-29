package interview_practice;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintMain {

	
	public static List<List<Integer>> prettyPrint(int n)
//	public static int prettyPrint(int n)
	{
		List<List<Integer>> list = new ArrayList<>(n);
		
		for(int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
			
			for(int j = 0; j < n; j++)
			{
				list.get(i).add(0);
			}
			for(int j = 0; j < n; j++)
			{
				list.get(i).set(j, n);
			}
		}
		
		int flag = n;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++) {
				list.get(i).set(i, flag);
			}
			flag--;
		}
		
		

		return list;
		
	}
	
	
	public static void main(String[] args) {
		
		 int n = 6;
		 List<List<Integer>> list = prettyPrint(n);
		
		 for(int i = 0; i < n; i++)
		 {
			 for(int j = 0; j < n; j++)
			 {
				 System.out.print(list.get(i).get(j)+" ");
			 }
			 System.out.println();
		 }
		 
		 

	}

}

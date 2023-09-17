package interview_practice.leetcode.contest;

import java.util.List;

public class Contest363A {
	
	
	 public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
		 
		 
		   int step =Math.abs( Math.abs(sy-fy) + (fx-(sx+Math.abs(sy-fy))) );
		   int step2 =Math.abs( Math.abs(sx-fx) + (fy-(sy+Math.abs(sx-fx))) );
//		   System.out.println("minimum sted needed: "+step);
		   System.out.println("step1: "+step+" , step2: "+step2);
		   
//		   if(step==0&&t==0&&step2==0) return false;
		   
		   if(sx==fx && sy == fy && t==1) return false;
           if(sx==fx && sy == fy && t==0) return true;
		   
		   if(t>=step && t>=step2) return true;
		 
		 
	       return false; 
	 }
	
	 
	public static void main(String[] args)
	{
//		List<Integer> list = List.of(5,10,1,5,2);
		List<Integer> list = List.of(4,3,2,1);
		
//		int k = 1;
		int k = 0;
		int res=0;
		
		for(int i=0; i<list.size(); i++)
		{
			int idx = i,cnt=0;
			
			while(idx>0) {
				int temp = idx & 1;
				if(temp >= 1) cnt++;
				idx = idx>>1;
			}
			
			if(cnt == k) {
				res += list.get(i);
			}
		}
		System.out.println(res);
	}

}

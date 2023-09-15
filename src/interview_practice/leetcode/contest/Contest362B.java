package interview_practice.leetcode.contest;

public class Contest362B {
	
	
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
//		int sx = 3, sy = 1, fx = 7, fy = 3, t = 3;
		
//		int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
		
//		int sx = 1, sy = 1, fx = 1, fy = 2, t = 1;
//		int sx = 1, sy = 2, fx = 1, fy = 2, t = 1;
		int sx = 1, sy = 4, fx = 1, fy = 2, t = 1;
		
		System.out.println(isReachableAtTime(sx, sy, fx, fy, t));
	}

}

package interview_practice.leetcode.dp;

public class CoinChange {

	
	public static int coinChange(int amount, int coins[], int step, int index, int dp[][])
	{
		if(index>=coins.length || amount < 0) return 100000009;
		
		if(amount == 0) return step;
		
		int r1=Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
		
		if(dp[amount][index] != -1) {
//			System.out.println("dp["+amount+"]["+index+"] != -1 : "+dp[amount][index]);
			return dp[amount][index];
		}
		
		r1 = coinChange(amount-coins[index], coins, step+1,index, dp);
		
		r2 = coinChange(amount,coins,step,index+1, dp);
//		System.out.println("dp["+amount+"]["+index+"]: "+Math.min(r1, r2));
		return dp[amount][index] = Math.min(r1, r2);
	}
	
	
	public static void main(String[]  args)
	{
		int coins[] = {1,2,5}, amount=11;
		
		
		int dp[][] = new int[amount+1][coins.length+1];
		for(int i=0;i<=amount; i++) {
			for(int j=0; j<=coins.length ; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(coinChange(amount, coins, 0, 0, dp));
		for(int i=0;i<=amount; i++) {
			for(int j=0; j<=coins.length ; j++) {
				System.out.println("dp["+i+"]["+j+"] : "+dp[i][j]);
			}
		}
	}
	
}

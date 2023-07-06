package interview_practice.leetcode.backtrack;

import java.util.Scanner;

public class NQueen {

	public static int count;
	
	public static boolean isValid(char board[][], int row, int col) {
		
		
		// horizontally check the cell is safe or not
		for(int j=0; j<=col; j++) {
			if(board[row][j] == 'Q') return false;
		}
		
		// vertically check the cell is safe or not
		for(int i=0; i<=row; i++) {
			if(board[i][col] == 'Q') return false;
		}
		
		// left-up diagonal check the cell is safe or not
		for(int i=row,j=col; i>=0 && j>=0; i--,j--) {
			if(board[i][j] == 'Q') return false;
		}
		
		// right-up diagonal check the cell is safe or not
		for(int i=row, j=col; i>=0 && j<board[i].length ; j++,i--) {
			 if(board[i][j] == 'Q') return false;
		}
		
		return true;
	}
	
	
	public static void nQueens(char board[][], int row) {
		
		if(board.length == row) {
			count++;
			printBoard(board);
			return;
		}
		
		for(int col=0; col<board.length; col++)
		{
			if(isValid(board,row,col)) {
				board[row][col] = 'Q';
				nQueens(board, row+1);
				board[row][col] = 'x';				
			}
		}
		
	}
	
	public static void printBoard(char board[][]) {
		System.out.println("======================   Chess Board    =========================");
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("NQueen");
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		// here n means row and column both
		
		char board[][] = new char[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j]='x';
			}
		}
		
		nQueens(board, 0);
		System.out.println("Possible board for nQueen :"+count);
		
		sc.close();
	}
	
}

package interview_practice.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSetSize {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<List<String>> board = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			board.add(Arrays.asList(new String[n]));
		}
		
		System.out.println("checking size :"+board.size());
		
		sc.close();
		
	}
	
}

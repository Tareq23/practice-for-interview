package interview_practice.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSetSize {

	public static void setSize() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<List<String>> board = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			board.add(Arrays.asList(new String[n]));
		}

		System.out.println("checking size :" + board.size());

		sc.close();

	}

	public static void referenceCheck(List<Integer> list) {
		list.add(4);
	}
	
	public static void main(String[] args) {
		List<Integer> arList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++)
		{
			arList.add(i, i*i);
		}
		System.out.println(arList.size());
//		referenceCheck(arList);
		
		arList.add(0, 45);
		System.out.println(arList.size());
		
		for(Integer value : arList) {
			System.out.print(value+" : ");
		}
		System.out.println();
	}

}

package interview_practice.leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExistsInGraph {

	// leetcode 1971 bfs/dfs easy
	public static boolean validPath(int n, int[][] edges, int source, int destination) {

		Queue<Integer> queue = new LinkedList<>();
		
		boolean mark[]  = new boolean[n+1];
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<>());
		}
		
		
		for(int i=0; i<edges.length; i++)
		{
			list.get(edges[i][0]).add(edges[i][1]);
			list.get(edges[i][1]).add(edges[i][0]);
		}
		
		queue.add(source);
		mark[source] = true;
		while(!queue.isEmpty())
		{
			source = queue.remove();
			
			
			if(source == destination) return true;
			for(int i=0; i<list.get(source).size(); i++)
			{
				if(!mark[list.get(source).get(i)]) {
					mark[list.get(source).get(i)] = true;
					queue.add(list.get(source).get(i));
				}
			}
		}
		
		return false;

	}

	public static void main(String[] args) {
		
		int source = 0, n = 3, edges[][] = {{0,1},{1,2},{2,3}}, destination = 2;
//		int source = 0, n = 6, edges[][] = {{0,1},{0,2},{3,5},{5,4},{4,3}}, destination = 5;
		
		System.out.println(validPath(n, edges, source, destination));

	}

}
 
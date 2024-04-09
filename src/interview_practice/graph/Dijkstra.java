package interview_practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Dijkstra {
	
	private static class Edge{
		int x;
		int cost;
		
		Edge(int _x, int _cost)
		{
			x = _x;
			cost = _cost;
		}
	}

	public static void shortestPathWithQueue(int n, int e, List<Edge>[] adj, int sr)
	{
		int[] dist = new int[n+1];
		boolean[] check = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			dist[i] = Integer.MAX_VALUE;
			check[i] = false;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(sr);
		
		dist[sr] = 0;
		
		while(!queue.isEmpty()) {
			
			int src = queue.peek();
			queue.remove();
			check[src] = true;
			
			for(int i = 0; i < adj[src].size(); i++)
			{
				int v = adj[src].get(i).x;
				int cost = adj[src].get(i).cost;
				if(!check[v]) {
					queue.add(v);

					if(dist[src] + cost < dist[v]) {
						dist[v] = dist[src] + cost;
					}
				}
			}
		}
		
		for(int i = 0; i <= n; i++)
		{
			System.out.println(i + " => "+dist[i]);
		}
		
	}
	
	public static void shortestPathWithPriorityQueue()
	{
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// number of node;
		// number of edge
		int n, edge;
		
		n = sc.nextInt();
		edge = sc.nextInt();
		
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] adj = new ArrayList[n+1];
		
		for(int i = 0; i <= n; i++) {
			adj[i] = new ArrayList<>();
		}
		
		for(int i = 1; i <= edge; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cost = sc.nextInt();
			adj[x].add(new Edge(y, cost));
			adj[y].add(new Edge(x, cost));
		}
		
		int sr = sc.nextInt();
		
		shortestPathWithQueue(n, edge, adj, sr);
		
	}
	
}

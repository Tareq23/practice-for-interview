package interview_practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BfsDemo {

	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // number of node
		
		int v = sc.nextInt(); // number of vertex
//		int vertice[][] = {{1,2},{1,3},{2,3}};
		
		int vertice[][] = {{1,2},{1,3},{2,4}};
		
		ArrayList<Integer> graph[] = new ArrayList[n];
		
		for(int i=0; i<n; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
//		for(int i=0; i<vertice.length; i++)
//		{
//			graph[vertice[i][0]].add(vertice[i][1]);
//			graph[vertice[i][1]].add(vertice[i][0]);
//		}
		boolean flag=false;
		int src = -1;
		for(int i=1; i<=v; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			graph[x].add(y);
			graph[y].add(x);
			if(!flag) {
				src=x;
				flag=true;
			}
			
		}
		
		
		boolean marks[] = new boolean[n];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
//		queue.add(vertice[0][0]);
		queue.add(src);
		List<Integer> levels = new ArrayList<>();
		
		while(!queue.isEmpty())
		{
			src = queue.element();
			levels.add(src);
			queue.remove();
			marks[src] = true;
			
			for(int i=0; i<graph[src].size(); i++)
			{
				int vx = graph[src].get(i);
				
				if(!marks[vx]) {
					queue.add(vx);
				}
			}
		}
		
		
		
		for(int i=0; i<levels.size(); i++)
		{
			System.out.print(levels.get(i)+", ");
		}
		
		
		
		
	}
	
}

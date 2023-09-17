package interview_practice.graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. What is Graph?
 * 	  -> Network of nodes. Each nodes are connected with each others with vertices. Suppose there are 5 number of nodes. 
 * 		 Node A, B, C, D, E. here node A connect with node B. B node is connect with node D and E. Node E connect with node C. When two nodes
 *       are connected, its called vertexes.
 *       
 * 2. Applications of graph?
 *    -> Maps
 *    -> Social Networks
 *    -> Delivery Networks
 *    
 * 3. Basics of Graphs
 * 
 *    VERTEX
 *    ------
 *    
 *    Edge Direction
 *    
 *    Uni-Directional
 *    Bi-Directional
 *    
 *    
 *    Edge Weight
 *    
 *    Weighted
 *    Un-weighted 
 *    
 *    
 *  Storing Graph
 *  
 *  Adjacency List
 *  Adjacency Matrix
 *  Edge List
 *  2D Matrix (implicit graph)
 *    
 * @author DELL
 *
 */

public class GraphDemo {
	
	
	static class Node{
		int data;
		Node left;
		Node right;
	}
	
	
	static class Edge{
		int src;
		int dest;
		
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}
	
	
	public static void createGraph(ArrayList<Edge> graph[], int vertice) {
		
		for(int i=0; i<graph.length; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<vertice; i++)
		{
			int x = sc.nextInt(), y = sc.nextInt();
			graph[x].add(new Edge(x,y));
		}
		
		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10; // number of nodes
		int v = 4; // number of vertexes 
		
		ArrayList<Edge> graph[] = new ArrayList[n];
		
//		createGraph(graph,v);
		
		ArrayList<Integer> adj[] = new ArrayList[n+1];
		
		
		for(int i=0; i<=n; i++) {
			adj[i] = new ArrayList<Integer>();
			adj[0].add(0);
		}
		
		System.out.println("size of 1: "+adj[0].size());
		
		
		
		
		

	}

}

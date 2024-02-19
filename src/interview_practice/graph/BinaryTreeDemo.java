package interview_practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeDemo {
	
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static int idx=-1;
	
	private static Node buildTree(List<Integer> list) {
		int index = 0;
		Node root = new Node(list.get(index++));
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty() && index < list.size()) {
			Node node = queue.poll();
			
			if(index<list.size() && list.get(index) != null) {
				node.left = new Node(list.get(index));
				queue.add(node.left);
			}
			index++;
			if(index<list.size() && list.get(index) != null) {
				node.right = new Node(list.get(index));
				queue.add(node.right);
			}
			index++;
		}
		return root;
	}
	
	
	public static Node buildTreeInPreorder(int nodes[])
	{
		idx++;
		
		if(nodes[idx]==-1)
		{
			return null;
		}
		
		Node newNode = new Node(nodes[idx]);
		
		newNode.left = buildTreeInPreorder(nodes);
		newNode.right = buildTreeInPreorder(nodes);
		
		return newNode;
	}

	
	public static void preorder(Node node)
	{
		if(node == null) return;
		
		System.out.print(node.data+", ");
		
		preorder(node.left);
		preorder(node.right);
	}
	
	public static void inorder(Node node)
	{
		if(node == null) return;
		
		inorder(node.left);
		System.out.print(node.data+", ");
		inorder(node.right);
	}
	
	public static void postorder(Node node)
	{
		if(node == null)
		{
			return ;
		}
		
		postorder(node.left);
		postorder(node.right);
		
		System.out.print(node.data+", ");
	}
	
	public static List<Integer> levelorder(Node node)
	{
		
//		if(node == null) return;
		
		Queue<Node> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		queue.add(node);
//		list.add(node.data);
		
		while(!queue.isEmpty())
		{
			Node src = queue.element();
			
			list.add(src.data);
			
			queue.remove();
			
			if(src.left != null) {
				queue.add(src.left);
			}
			
			if(src.right != null)
			{
				queue.add(src.right);
			}	
		}
		return list;
	}
	
	public static int countOfNode(Node node)
	{
		if(node == null) return 0;
		
		int leftCount =  countOfNode(node.left);
		
		int rightCount = countOfNode(node.right);
		
		return leftCount+rightCount +1;
	}
	
	public static int sumOfNode(Node node)
	{
		if(node == null) return 0;
		
		int leftSum =  sumOfNode(node.left);
		
		int rightSum = sumOfNode(node.right);
		
		return leftSum + rightSum + node.data;
	}
	
	public static int heightOfTree(Node node)
	{
		if(node == null) return 0;
		
		int left = 1+heightOfTree(node.left);
		int right = 1+heightOfTree(node.right);
		
		return Math.max(left,right);
	}
	
	public static void main(String[] args) {
		
		
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3, -1, 6, -1, -1};
		
		Node root = buildTreeInPreorder(nodes);
		
		System.out.println("Root: "+root.right.data);
		
		System.out.println("Preorder: ");
		preorder(root);
		System.out.println("\nInorder: ");
		inorder(root);
		System.out.println("\nPostorder: ");
		postorder(root);
		
		
		System.out.println("\nLevel-Order: ");
		
		List<Integer> list = levelorder(root);
		
		
		System.out.println(list);
		
		System.out.println("Number of nodes: "+countOfNode(root));
		System.out.println("Sum of nodes: "+sumOfNode(root));
		System.out.println("Height of tree: "+heightOfTree(root));
		
	}

}

package interview_practice.graph;

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

	public static void main(String[] args) {
		
		
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3, -1, 6, -1, -1};
		
		Node root = buildTreeInPreorder(nodes);
		
		System.out.println("Root: "+root.right.data);

	}

}

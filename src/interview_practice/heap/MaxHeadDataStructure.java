package interview_practice.heap;

public class MaxHeadDataStructure {
	
	public static class Node{
		int value;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.value = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node add(Node currentNode, int data)
	{
		if(currentNode == null) {
			return currentNode =  new Node(data);
		}
		
		if(currentNode.left == null) {
			return add(currentNode.left, data);
		}
		
		else if(currentNode.right == null) {
			return add(currentNode.right, data);
		}
		else {
			return add(currentNode.left, data);
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
	}

}

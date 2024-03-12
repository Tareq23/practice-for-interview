package interview_practice.tree;

public class BinarySearchTree {

	private static class Node{
		int data;
		Node left;
		Node right;
		Node(int _data){
			data = _data;
			left = null;
			right = null;
		}
	}
	
	static Node insert(Node root, int value) {
		
//		System.out.println(value+";;;;");
		if(root == null) {
			 return root =  new Node(value);
		}
		
		
		if(value < root.data) {
			root.left =  insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
		return root;
		
	}
	
	static void traverse(Node root)
	{
		if(root == null) return;
		
		// pre-order traverse
		
		traverse(root.left);
		traverse(root.right);
		System.out.println(root.data);
	}
	
	void delete() {}
	
	public static void main(String[] args) {
		
		int[] nums = {90, 60, 50, 95,65, 48, 98, 100, 25};
		Node root = new Node(nums[0]);
		Node temp = root;
		for(int i = 1; i < nums.length; i++)
		{
			temp = insert(temp, nums[i]);
		}
		
		
		
		traverse(root);
		
	}

}

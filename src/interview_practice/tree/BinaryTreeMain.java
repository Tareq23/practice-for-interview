package interview_practice.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTreeMain {

	static List<Integer> list;
	
	public static void traverse(TreeNode root) {
		if(root == null) return;
		traverse(root.left);
		traverse(root.right);
		list.add(root.val);
	}
	
	public static List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return list;
    }
	
	public static void insert(List<Integer> list) {
		
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
//		Stack<TreeNode> stack = new Stack<>();
	    List<Integer> list = new ArrayList<>();
	    if(root == null) return list;
	    
	    Stack
	    
	    while(root != null || !stack.empty()){
	        while(root != null){
	            stack.push(root);
	            root = root.left;
	        }
	        root = stack.pop();
	        list.add(root.val);
	        root = root.right;
	        
	    }
	    return list;
	}
	
	public static void main(String[] args) {
		list  = new ArrayList<>();
		List<Integer> listNode = new ArrayList<>();
		listNode.add(1);
		listNode.add(null);
		listNode.add(2);
		listNode.add(3);
	}

}

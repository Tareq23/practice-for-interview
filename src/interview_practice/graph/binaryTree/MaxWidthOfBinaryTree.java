package interview_practice.graph.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MaxWidthOfBinaryTree {

	static class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = null;
			right = null;
		}
	}

	static class Pair {
		Node node;
		int index;
		int level;

		Pair(Node _node, int idx, int _level) {
			node = _node;
			index = idx;
			level = _level;
		}
		
		Pair(Node _node, int _index){
			node = _node;
			index = _index;
		}
	}

	private static Node buildTree(List<Integer> list) {
		int index = 0;
		Node root = new Node(list.get(index++));
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty() && index < list.size()) {
			Node node = queue.poll();

			if (index < list.size() && list.get(index) != null) {
				node.left = new Node(list.get(index));
				queue.add(node.left);
			}
			index++;
			if (index < list.size() && list.get(index) != null) {
				node.right = new Node(list.get(index));
				queue.add(node.right);
			}
			index++;
		}
		return root;
	}

	private static int maximumWidth(Node root) {
		if (root == null)
			return 0;

		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(root, 0, 0));
		List<Pair> list = new ArrayList<>();
		list.add(new Pair(root, 0, 0));

		while (!queue.isEmpty()) {

			Pair newPair = queue.poll();

			if (newPair.node.left != null) {
				queue.add(new Pair(newPair.node.left, newPair.index * 2 + 1, newPair.level + 1));
				list.add(new Pair(newPair.node.left, newPair.index * 2 + 1, newPair.level + 1));
			}

			if (newPair.node.right != null) {
				queue.add(new Pair(newPair.node.right, newPair.index * 2 + 2, newPair.level + 1));
				list.add(new Pair(newPair.node.right, newPair.index * 2 + 2, newPair.level + 1));
			}
		}
		list.sort((e1, e2) -> {
			return e1.level < e2.level ? 1 : 0;
		});
		
		Pair pair = list.get(0);
		int res = 1;
		for (int i = 1;  i < list.size();  i++) {
			
			if(pair.level != list.get(i).level) {
				pair = list.get(i);
			}
			
			res =  Math.max(res, Math.abs(pair.index - list.get(i).index)+1);
			System.out.println(" ==> "+res);
		}
		return res;
	}
	
	
	private static int maxWidth(Node root)
	{
		if(root == null) return 0;
		
		int ans = 0;
		
		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(root, 0));
		
		while(!queue.isEmpty())
		{
			int size = queue.size();
			int minIndex = queue.peek().index; /* to make the id starting from zero */
			int first = 0, last = 0;
			for(int i = 0; i < size; i++)
			{
				int curIndex = queue.peek().index - minIndex;
				Node node = queue.peek().node;
				queue.poll();
				if(i == 0) first = curIndex;
				if(i == (size - 1)) last = curIndex;
				
				if(node.left != null)
				{
					queue.offer(new Pair(node.left, curIndex * 2 + 1));
				}
				if(node.right != null) {
					queue.offer(new Pair(node.right, curIndex * 2 + 2));
				}
			}
			ans = Math.max(ans, last - first + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//	1,3,2,5,3,null,9
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(null);
		list.add(9);
		
		Node root = buildTree(list);

		int res = maximumWidth(root);
		System.out.println(res);
		
		res = maxWidth(root);
		System.out.println("maximum width of binary from approximately better solution: "+res);
	}

}

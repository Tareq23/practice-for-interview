package interview_practice.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}

public class LeftViewOfBinaryTree {

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

	public static void leftView(Node root, int level, List<Integer> res) {
		if (root == null)
			return;

		if (level == res.size())
			res.add(root.data);

		leftView(root.left, level + 1, res);
		leftView(root.right, level + 1, res);

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(null);
		list.add(null);
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(6);
		Node root = buildTree(list);
//		System.out.println(root.data);
		leftView(root, 0, res);
		res.forEach(e -> {
			System.out.print(e + " ");
		});
	}

}

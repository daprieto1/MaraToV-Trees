package org.bizagi.maratov;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null)
				left = new TreeNode(value);
			else
				left.insert(value);
		} else {
			if (right == null)
				right = new TreeNode(value);
			else
				right.insert(value);
		}
	}

	public boolean contains(int value) {
		if (value == data)
			return true;
		else if (value < data) {
			if (left == null)
				return false;
			else
				return left.contains(value);
		} else {
			if (right == null)
				return false;
			else
				return right.contains(value);
		}
	}

	public void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	public void inorderTraversal(TreeNode root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}
	}

	public void postorderTraversal(TreeNode root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data);
		}
	}

	public void levelOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			System.out.println(node.data);

			if (node.left != null)
				queue.add(node.left);

			if (node.right != null)
				queue.add(node.right);
		}
	}

}

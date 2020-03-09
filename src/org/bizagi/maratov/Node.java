package org.bizagi.maratov;

public class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null)
				left = new Node(value);
			else
				left.insert(value);
		} else {
			if (right == null)
				right = new Node(value);
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

	public void preorderTraversal(Node root) {
		if (root != null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	public void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}
	}

	public void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data);
		}
	}

}

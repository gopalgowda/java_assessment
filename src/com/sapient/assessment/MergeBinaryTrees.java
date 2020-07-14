package com.sapient.assessment;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	// Recursive merge method
	static TreeNode mergeBinaryTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		t1.val = t1.val * t2.val;
		t1.left = mergeBinaryTrees(t1.left, t2.left);
		t1.right = mergeBinaryTrees(t1.right, t2.right);
		return t1;
	}

	static void preOrderTraversal(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.val + " ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
}

public class MergeBinaryTrees {

	public static void main(String[] args) {

		// Build Example1 Tree1
		TreeNode tree1 = new TreeNode(5, null, null);
		tree1.left = new TreeNode(3, null, null);
		tree1.right = new TreeNode(6, null, null);
		tree1.left.left = new TreeNode(2, null, null);

		// Build Example1 Tree2
		TreeNode tree2 = new TreeNode(4, null, null);
		tree2.left = new TreeNode(2, null, null);
		tree2.left.right = new TreeNode(1, null, null);

		TreeNode.mergeBinaryTrees(tree1, tree2);
		System.out.print("Example 1: PreOrder Traversal of merged binary tree : ");
		TreeNode.preOrderTraversal(tree1);
		System.out.println("\n");

		// Build Example2 Tree3
		TreeNode tree3 = new TreeNode(6, null, null);
		tree3.left = new TreeNode(3, null, null);
		tree3.right = new TreeNode(2, null, null);
		tree3.right.right = new TreeNode(1, null, null);
		tree3.right.right.left = new TreeNode(5, null, null);

		// Build Example1 Tree4
		TreeNode tree4 = new TreeNode(10, null, null);
		tree4.left = new TreeNode(5, null, null);
		tree4.right = new TreeNode(1, null, null);
		tree4.right.left = new TreeNode(3, null, null);

		TreeNode.mergeBinaryTrees(tree3, tree4);
		System.out.print("Example 2: PreOrder Traversal of merged binary tree : ");
		TreeNode.preOrderTraversal(tree3);

	}
}

package com.ff.algorithm.interview;

/**
 * 
 * @author yu
 *
 *监控二叉树
 */
public class MonitorBinaryTree {
	static int  cameras = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		node.left = node2;
		node2.left = node3;
		node3.left = node4;
		node4.right = node5;
		minCanamer(node);
		System.out.println(cameras);


	}

	public static int minCanamer(TreeNode node) {
		int result =0;
		TreeNode dummyNode = new TreeNode(0);
		dummyNode.left = node;
		result = dfs(dummyNode);		
		return cameras;
	}

	public static int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}
		
		int l = dfs(node.left);
		int r = dfs(node.right);
		
		if (l + r == 0) {
			return 1;
		}
		
		if (l == 1|| r ==1) {
			System.out.println("camera:"+node.val);
			cameras ++;
			return 2;
		}
		
		return 0;
	}
}

class TreeNode{
	int val;
	public TreeNode(int val ) {
		this.val = val;
	}
	TreeNode left,right;
}


package com.ff.algorithm.leetcode;
/** 
* @author cornyu 
* @version 创建时间：2019年9月15日 上午11:26:09 
* 求第k 小的数
* leetcode - 230
* 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
* 
*/
public class KthSmallest {

	private int i = 0;
    private int val = 0;
    
	public static void main(String[] args) {
		
		TreeNode head = new TreeNode(0);
		int[] treeNodeList = new int[] {};
		
	}
	
	
	 public int kthSmallest(TreeNode root, int k) {
	        ldr(root, k);
	        return val;
	  }
	 
	 
	 public void ldr(TreeNode root, int k) {
	        if (root == null) {
	            return;
	        }
	        ldr(root.left, k);
	        if (k == ++i) {
	            val = root.val;
	        }
	        ldr(root.right, k);
	    }



}

// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

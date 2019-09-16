package com.ff.algorithm.leetcode;

import java.util.Stack;

/** 
* @author cornyu 
* @version 创建时间：2019年9月13日 上午10:53:35 
* 类说明 
* 
* 无向图的 深度优先搜素
* 
* 无向图 可以用领接矩阵Adjacency-matrix【如果相邻的点比较多，则合适】，领接链表Adjacency-list表示。
* 
* https://www.cnblogs.com/mcomco/p/10298021.html
* 
*/


public class DepthFirstPaths {

	
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		
		System.out.println(stack.pop());
	}

	
}

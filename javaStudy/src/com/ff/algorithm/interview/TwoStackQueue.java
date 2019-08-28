package com.ff.algorithm.interview;

import java.util.Stack;

/** 
* @author cornyu 
* @version 创建时间：2019年8月13日 下午8:14:45 
* 类说明 
* 用两个栈来实现 队列 功能
*/
public class TwoStackQueue {
	
	public Stack<String> pushStack;
	public Stack<String> popStack;
	
	public TwoStackQueue() {
		pushStack = new Stack<String>();
		popStack = new Stack<String>();
	}
	
	/**
	 * 向队列里添加 内容
	 * 往 栈A 添加内容
	 * @param content
	 */
	public void add(String content) {
		pushStack.push(content);
	}
	
	/**
	 * 队列出数据
	 * @return
	 */
	public String poll() throws Exception {
		if (pushStack.empty() && popStack.empty()) {
			throw new Exception("Queue is empty");
		}else if(popStack.empty()) {
			//栈B作为出栈，栈B如果为空，则将栈A内容 全部放入栈B
			
			while(!pushStack.empty()) {
				popStack.push(pushStack.pop());
			}
			
		}
		return popStack.pop();
		
	}
	
	

	public static void main(String[] args) throws Exception {
		TwoStackQueue queue = new TwoStackQueue();
	        queue.add("1");
	        queue.add("2");
	        queue.add("3");
	        queue.add("4");
	        System.out.println(queue.pushStack);
	        System.out.println(queue.popStack);

	        System.out.println(queue.poll());
	        System.out.println(queue.poll());
	}

}

package com.ff.algorithm.leetcode;



/**
 * @author cornyu
 * @version 创建时间：2019年8月21日 下午4:49:05 类说明 You are given two non-empty linked
 *          lists representing two non-negative integers. The digits are stored
 *          in reverse order and each of their nodes contain a single digit. Add
 *          the two numbers and return it as a linked list.
 * 
 *          You may assume the two numbers do not contain any leading zero,
 *          except the number 0 itself.
 * 
 *          Example:
 * 
 *          Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *          Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

	public static void main(String[] args) {

		ListNode l11 = new ListNode(2);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(3);

		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);

		l11.setNext(l12);
		l12.setNext(l13);

		l21.setNext(l22);
		l22.setNext(l23);

		printListNode(l11);
		//printListNode(l21);

		ListNode result = new AddTwoNumbers().addTwoNumbers(l11, l21);
		printListNode(result);
		
		System.out.println("-----");
		printListNode(l11);

	}

	public static void printListNode(ListNode list) {
		while (list != null) {
			System.out.print(list.getVal() + "->");
			list = list.getNext();
		}
		System.out.println();

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode curr = dummyHead;
		int carry = 0;

		while (l1 != null || l2 != null) {
			int x = (l1 == null) ? 0 : l1.getVal();
			int y = (l2 == null) ? 0 : l2.getVal();

			int sum = carry + x + y;
			carry = sum / 10;

			curr.next = new ListNode(sum % 10);
			curr = curr.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		if (carry > 0) {
			curr.next = new ListNode(carry);
		}

		System.out.println("prc");
		//printListNode(l1);

		return dummyHead.next;
	}

}

// 链表节点
class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}

package com.ff.algorithm.leetcode;
/** 
* @author cornyu 
* @version 创建时间：2019年9月13日 下午1:32:20 
* 类说明 
* 判断数字是否为回文
*/
public class NumberIsPalindrome {

	public static void main(String args[]) {
		System.out.println(isPalindrome(1234321));
	}
	
	public static boolean isPalindrome(int x) {
		if (x<0) {
			return false;
		}
		int copyX = x,reverse =0;
		while(copyX > 0) {
			reverse = reverse *10 + copyX % 10;
			copyX = copyX / 10;
		}
		return reverse == x;
	}
}

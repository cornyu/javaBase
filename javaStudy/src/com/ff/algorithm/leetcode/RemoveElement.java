package com.ff.algorithm.leetcode;
/** 
* @author cornyu 
* @version 创建时间：2019年9月13日 下午2:22:59 
* 类说明 
*/
public class RemoveElement {

	public static void main(String[] args) {
		int [] arryTest = new int[] {1,2,3,2,4,2,1};
		System.out.println(removeElement(arryTest, 2));
		System.out.println("--------------");
		for(int i:arryTest) {
			System.out.println(i);
		}
	}
	
	public static int removeElement(int[] arry ,int val) {
		int tail = 0;
		int length = arry.length;
		for(int i=0;i<length;++i) {
			if (arry[i] != val) {
				System.out.println("i:"+arry[i]);
				arry[tail++] = arry[i];
			}
		}
		return tail;
		
	}

}

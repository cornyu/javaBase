package com.ff.algorithm.leetcode;

import java.util.Arrays;

import javax.ejb.Init;

/** 
* @author cornyu 
* @version 创建时间：2019年8月11日 上午11:25:43 
* 类说明 
* 整数反转问题
*/
public class IntReverse {

	public static void main(String[] args) {
		IntReverse test = new IntReverse();
		System.out.println(test.reverse(12345));
		System.out.println(test.reverse(-3450));
		
		int[] test1 = new int[] {1,3,4,2,5,3,4};
		Arrays.sort(test1);
		for(int i:test1) {
			System.out.println(i);
		}
		
	}
	
	
	public int reverse(int x) {
        int result = 0;
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        result = (x< 0) ? ( Integer.parseInt(reversed) * -1 ) : (Integer.parseInt(reversed));
        return result;
		
    }

}

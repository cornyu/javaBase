package com.ff.algorithm.leetcode;

import java.util.Scanner;

/**
 * @author cornyu
 * @version 创建时间：2019年9月14日 下午1:41:14 类说明
 */
public class ABSum {

	public static void main(String[] args) {
		//System.out.println(Integer.toBinaryString(1000));// 1111101000
		
		//Scanner sc = new Scanner(System.in);
		int a = 1000;
		if (0< a && a <=1000) {
			int countA = 0;
			int countB = 0;
			for(int i=1; i<=a; i++) {
				if (isA(i)) {
					countA++;
				}else {
					countB++;
				}
			}
			System.out.println(countA + " "+countB);
		}
		
		
	}

	/**
	 * 统计1的个数
	 * 
	 * @param n
	 * @return
	 */
	static int countASum(int n) {
		int res = 0;
		while (n != 0) {
			res += n & 1;
			n >>>= 1;
		}
		//System.out.println("res:" + res);
		return res;
	}

	static boolean isA(int n) {
		//System.out.println("n二进制：" + Integer.toBinaryString(n));
		int length = Integer.toBinaryString(n).length();
		int countA = countASum(n);
		int countB = length - countA;
		//System.out.println("n:"+n +"--> A:"+countA+",B:"+countB);
		if (countA > countB) {
			return true;
		} else {
			return false;
		}
	}

}

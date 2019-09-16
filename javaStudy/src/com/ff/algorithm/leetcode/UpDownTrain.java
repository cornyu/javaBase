package com.ff.algorithm.leetcode;

import java.util.Scanner;

/**
 * @author cornyu
 * @version 创建时间：2019年9月14日 下午12:04:10 类说明
 */
public class UpDownTrain {

	public static void main(String[] args) {
		
//		System.out.println(upTrain(6));
//		System.out.println(downTrans(6));

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		//System.out.println("a:"+a+",n:"+n+",m:"+m+",x:"+x);
		int b = (m - upTrain(n-1)*a )/downTrans(n-1);
		//System.out.println(b);
		
		if (x < n) {
			int result = upTrain(x)*a + downTrans(x)*b;
			System.out.println(result);
		}else {
			System.out.println(m);
		}
		
		
	}

	/**
	 * 下车系数
	 * 
	 * @param x
	 * @return
	 */
	static int downTrans(int x) {
		int result = 0;
		if (x <= 0) {
			return 0;
		}
		if (x == 1 || x == 2 || x == 3) {
			return 0;
		}

		if (x == 4) {
			return 1;
		} else if (x == 5) {
			return 2;
		} else if (x > 5) {
			result = downTrans(x - 1) + downTrans(x - 2) + 1;
		}
		return result;
	}

	static int upTrain(int x) {
		int result = 0;
		if (x <= 0) {
			return 0;
		}
		if (x == 1 || x == 2) {
			return 1;
		}
		if (x == 3) {
			return 2;
		}
		if (x > 3) {
			result = (upTrain(x - 2) + upTrain(x - 1) - 1);
		}
		return result;
	}

}

package com.ff.algorithm.leetcode;

import java.math.BigInteger;
import java.util.Scanner;


/** 
* @author cornyu 
* @version 创建时间：2019年9月12日 下午1:52:07 
*  
* 1∼n 之间素数个数。


*/
public class sushuSum {

	static boolean issushu(long  n) {
		if (n < 0) {
			return false;
		}
		if (n ==1 || n==2) {
			return true;
		}
		for(int i= 2;i <= Math.sqrt(n);i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println(issushu(15));
		
		Scanner scanner = new Scanner(System.in);
		BigInteger currentVal = null;  // 2≤n≤10 的11次方​
		if (scanner.hasNext()) {
			currentVal = scanner.nextBigInteger();
			scanner.nextLong();
		}
		//BigInteger currentVal = new BigInteger(n);
		BigInteger maxVal = new BigInteger("1000000000000");
		BigInteger minVal = new BigInteger("2");
		if ((currentVal.compareTo(minVal) < 0)  ||(currentVal.compareTo(maxVal) > 0 ) ) {
			System.out.println("超出范围："+currentVal.toString());
			return;
		}
		
		//long data = 10000000000;
		//System.out.println("n:"+n);
		int sum =0;
		BigInteger start = BigInteger.valueOf(1);
		BigInteger step = BigInteger.valueOf(1);

		for(;start.compareTo(currentVal) <=0; start = start.add(step)) {
			if (start.isProbablePrime(1)) {
				System.out.println("素数："+start.toString());
				sum++; 
			}
		}
		
		System.out.println(sum);
		
	}

}

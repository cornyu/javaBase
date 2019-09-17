package com.ff.algorithm.leetcode;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author yu
 *
 *请编写程序，实现对用户输入的 n （n<100）求出1~n的最小公倍数。

 例如： 用户输入： 6 程序输出： 60

 用户输入： 10 程序输出： 2520
 
 */
public class Minmugcd {

	/**
	 * 判断是否为素数
	 * @param n
	 * @return
	 */
	static boolean issushu(int n) {
		if(2 == n || 1==n)
		{
			return true;
		}
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		BigInteger result = BigInteger.ONE;
		
		while(scanner.hasNext()) {
			
			int n = scanner.nextInt();
			System.out.println("<--"+n);
			/*
			 * if(n==0) { break; }
			 */
			for(int i=2; i<=n; i++) {
				
				int tmp =1;
				if(issushu(i)) {
					System.out.println("sushu:"+i);
					while(tmp * i <= n) {
						tmp = tmp *i;
					}
				}
				
				result = result.multiply(BigInteger.valueOf(tmp));
				
			}
			result = result.mod(BigInteger.valueOf(1000000000));
			System.out.println("result-->"+result);
			break;
			
		}
		
		
	}

}

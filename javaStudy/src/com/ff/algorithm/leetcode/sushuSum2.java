package com.ff.algorithm.leetcode;

import java.util.Scanner;

/** 
* @author cornyu 
* @version 创建时间：2019年9月13日 上午6:50:58 
* 类说明 
*/
public class sushuSum2 {
	static boolean issushu(long n ) {
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
	
	static long sushuSum2(long n) {
		long count = 0;
		long i,j;  
	     boolean m;  
	     for(i = 1; i <= n; i ++){  
	           m = true;  
	           for(j = 2; j < i; j ++){  
	                 if(i % j == 0){  
	                      m = false;  
	                      break;  
	                 }  
	           }  
	           if(m){  
	        	   count++;
	           }  
	     }  	
		return count;

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = 0; // 2≤n≤10 的11次方​
		if (scanner.hasNext()) {
			n = scanner.nextLong();
		}
		
		long startTime = System.currentTimeMillis();
		System.out.println(sushuSum(n));
		long entTime = System.currentTimeMillis();
		System.out.println("耗时："+(entTime - startTime));
		
		
		long startTime2 = System.currentTimeMillis();
		System.out.println(sushuSum2(n));
		long entTime2 = System.currentTimeMillis();
		System.out.println("耗时2："+(entTime2 - startTime2));
		
		
	}
	
	static long sushuSum(long n) {
		long sum =0;
		for(long i=1;i<= n; i++) {
			if (issushu(i)) {
				//System.out.println("素数："+i);
				sum++; 
			}
		}	
		return sum;
	}
}

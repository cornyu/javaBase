package com.ff.algorithm.interview;
/**
 * 
 * @author yu
 *
 *	动态规划 求解货币组合 有多少种
 */
public class MoneySum {
	
	public static void dynamic_prommgram(int[] coins,int n){
		int[][] d = new int[coins.length+1][n+1];//length+1表示不适用任何币种、只使用1、只使用1 2 只使用1 2 3......等等，共length+1种情况，且n+1表示总计0、1.....至n元共n+1种情况
		for(int i = 0;i<=coins.length;i++) d[i][0] = 1; 
		for(int i = 1 ;i<=coins.length;i++){//因为d[0][i]是0，所以i从1开始
			for(int sum = 1;sum<=n;sum++){//由于d[i][0]==1，所以j从1开始
				for(int k=0;k<=sum/coins[i-1];k++){//例如，使用面值为1时，对应的coins[]下标是i-1，逻辑上河实际上不是一致的
					d[i][sum] +=d[i-1][sum-k*coins[i-1]];
				}				
			}
		}
		System.out.println(n+"的组合方式有:"+d[coins.length][n]+"种" );
	}

	
	public static void main(String[] args){
	    long[] d= new long[201];
	    d[0]=1;
	    int[] v={1,2,5,10,20,50,100};
	    for(int i=0;i<7;i++){
	        for(int j=v[i];j<201;j++){
	            d[j]+=d[j-v[i]];	   //相当于     		        	
	        }
	    } 	 
	    System.out.println(200+"的组合方式有"+d[200]+"种");
	    
	    dynamic_prommgram(v,200);
}


	
	

}

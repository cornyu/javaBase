package com.ff.algorithm.sort.quicksort;
import java.util.Arrays;

/**
 * @author cornyu
 * @version 创建时间：2018年10月27日 下午7:53:02 类说明 :快速排序  快速排序，顾名思义，是一种速度快，效率高的排序算法。
 *          快排原理：      
 *            在要排的数（比如数组A）中选择一个中心值key（比如A[0]），通过一趟排序将数组A分成两部分，其中以key为中心，key右边都比key大，key左边的都key小，然后对这两部分分别重复这个过程，直到整个有序。
 *                  整个快排的过程就简化为了一趟排序的过程，然后递归调用就行了。         一趟排序的方法：
 *          1，定义i=0，j=A.lenght-1，i为第一个数的下标，j为最后一个数下标
 *          2，从数组的最后一个数Aj从右往左找，找到第一小于key的数，记为Aj； 
 *          3，从数组的第一个数Ai
 *          从左往右找，找到第一个大于key的数，记为Ai； 
 *          4，交换Ai 和Aj  
 *          5，重复这个过程，直到 i=j
 *          6，调整key的位置，把A[i] 和key交换 假设要排的数组为：A[8] ={ 5 2 8 9 2 3 4 9 }          
 *           选择 key = 5， 开始时 i=0，j=7   index       0    1    2    3    4    5  
 *           6    7
 * 
 *          开始：       5    2    8    9    2    3    4    9                   i  
 *                                                j   第一次找   5    2    8    9   
 *          2    3    4    9                               i                    
 *            j 交换：       5    2    4    9    2    3    8    9                 
 *                        i                       j 第二次找   5    2    4    9    2
 *             3    8    9                                     i           j 交换：
 *                5    2    4    3    2    9    8    9                          
 *                    i            j 第三次找    5    2    4    3    2    9    8  
 *           9                                           ij    调整key： 2    5  
 *           4    3    5    9    8    9 --------------------- 作者：Yexiaofen
 *          来源：CSDN 原文：https://blog.csdn.net/Yexiaofen/article/details/78018204
 *          版权声明：本文为博主原创文章，转载请附上博文链接！
 */
public class QKSortDemo {

	public static void main(String[] args) {
		String name = "与d";
		String name2 = "与d244";
		
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
		
		int[] a = {27,2,13,65,78,23,11,34,11};
		System.out.println(Arrays.toString(a));
		quickSort(a);
		System.out.println(Arrays.toString(a));
		

	}

	private static void quickSort(int[] a) {
		if (a.length > 0) {
			quickSort(a,0,a.length -1);
		}
	}

	/**
	 * 递归算法
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void quickSort(int[] a, int low, int hign) {
		if (low >= hign) {
			return ;
		}
		
		int i = low;
		int j = hign;
		int k = a[low];
		//完成1躺排序
		while(i < j) {
			//
			while(i < j && a[j] >= k) {
				j--;
			}
			
			while(i < j && a[i] <= k) {
				i++;
			}
			
			if (i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			
		}
		//交换 key 和 i的位置
		int p = a[i];
		a[i] = k;
		a[low] = p;
		
		//重复左边 
		quickSort(a, low, i-1);
	
		//重复右边
		quickSort(a, i+1, hign);

		
		
	}

}

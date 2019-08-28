package designPattern.strategy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:08:33 
 * 插入排序
 */
public class InsertionSort implements Sort {
	public int[] sort(int arr[]) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int j;
			int temp = arr[i];
			for (j = i; j > 0; j--) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];

				} else
					break;
			}
			arr[j] = temp;
		}
		System.out.println("插入排序");
		return arr;
	}
}

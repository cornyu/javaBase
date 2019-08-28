package designPattern.strategy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:09:53 类说明
 */
public class ArrayHandler {

	private Sort sortObj;

	public int[] sort(int arr[]) {
		sortObj.sort(arr);
		return arr;
	}

	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj;
	}
}

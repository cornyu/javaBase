package designPattern.strategy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:10:39 类说明
 */
public class TestStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 2, 5, 3, 7, 10, 9 };
		int result[];
		
		// 这里就是具体的策略
		Sort sort = new SelectionSort(); // 使用选择排序
		
		ArrayHandler ah = new ArrayHandler();
		ah.setSortObj(sort); // 设置具体策略
		result = ah.sort(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
		
	}
}

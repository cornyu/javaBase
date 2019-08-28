package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/** 
* @author cornyu 
* @version 创建时间：2017年12月23日 下午7:36:11 
* 类说明 
*/
public class Test1  implements TestI{
	static List<String> list = new ArrayList<String>();
	private static long count =0;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InterruptedException {
		
		
		String a = "TT.tt";
		String[] result = a.split("\\.");
		System.out.println(result.length);
		
		System.out.println(a.substring(1, 3));
		
//		
//		
//		List list = new ArrayList();
//		new Thread(new TestRunnable(list)).start();
//		
//		Thread.sleep(2000);
//		
//		System.out.println("test："+list);
		
		test();
		
	}
	
	private static void test() {
		System.out.println(count);
		count++;
		test();
	}

	public void saySomething(String msg) {
		System.out.println(msg);
		new TestHash().testPrint2();
	}
	
	public void dosomething() {
		System.out.println("do something");
	}

	
	

}

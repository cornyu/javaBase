package test;

import java.util.ArrayList;
import java.util.List;

/** 
* @author cornyu 
* @version 创建时间：2018年1月18日 下午4:40:19 
* 类说明 
*/
public class TestHash {

	private TestI test = new Test1();
	
	public static void main(String[] args) {
		String text = "cornyu1244";
		System.out.println(text.hashCode());   //-830462769
		
		List<String> list = new 	ArrayList<String>();
		list.add("1");
		
		new Thread(new TestRunnable(list)).start();
		TestHash testHash = new TestHash();
		testHash.testPrint();
		
		
	}
	
	public void testPrint() {
		System.out.println(FF.TEST);
		this.testPrint2();
		this.testPrint2(FF.TEST);
		test.dosomething();

	}
	
	public void testPrint2() {
		System.out.println(FF.TEST);
	}
	
	public void testPrint2(String mesg) {
		new Test1().saySomething("1245");
	}
	
	public void test1(TestI test) {
		test.dosomething();
		System.out.println("dd");
	}


}

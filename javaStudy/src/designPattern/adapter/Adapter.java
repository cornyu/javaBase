package designPattern.adapter;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-16 下午3:17:16 
 * 类的适配器模式
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}
	
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}

}

package designPattern.adapter.object;

import designPattern.adapter.Source;
import designPattern.adapter.Targetable;

/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-16 下午3:50:03 
 * 对象适配
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题
 */
public class ObjectWrapper implements Targetable{
	private Source source;  
	
	public ObjectWrapper(Source source){
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
        System.out.println("this is the targetable method!");  
	}

	public static void main(String[] args) {

	}
}

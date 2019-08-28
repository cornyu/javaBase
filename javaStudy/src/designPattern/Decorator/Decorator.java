package designPattern.Decorator;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-16 下午3:09:44 
 * 装饰模式
 * 装饰模式就在不改变原类文件和使用继承的条件下 给一个对象增加一些新的功能，而且是动态的，
 * 要求装饰对象和被装饰对象实现同一个接口(特点)，
 * 装饰对象持有被装饰对象的实例
 */
public class Decorator implements Sourceable{

	private Sourceable source;
	
	public Decorator(Sourceable source){
		super();
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("装饰者 模式前");
		source.method();
		System.out.println("装饰者 模式后");

	}

}

package base.cglib;
/** 
* @author cornyu 
* @version 创建时间：2018年3月23日 下午5:48:11 
* 类说明 
*/
public class Test {
	public static void main(String[] args) {
		HelloImpl helloImpl =  new HelloImpl();
		HelloImpl helloFactory = (HelloImpl) new ProxyFactory(helloImpl).getProxyInstance();
		helloFactory.sayHello("he");
			
	}
}

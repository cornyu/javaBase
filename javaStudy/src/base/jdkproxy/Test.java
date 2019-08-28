package base.jdkproxy;
/** 
* @author cornyu 
* @version 创建时间：2018年3月23日 下午6:24:15 
*  JDK动态代理所用到的代理类在程序调用到代理类对象时才由JVM真正创建，JVM根据传进来的 业务实现类对象 以及 方法名 ，
*  动态地创建了一个代理类的class文件并被字节码引擎执行，然后通过该代理类对象进行方法调用
*/
public class Test {

	public static void main(String[] args) {
		CarImpl carImpl = new CarImpl();
		JDKProxy proxy = new JDKProxy();
		ICar carImplProxy = (ICar) proxy.bind(carImpl);
		carImplProxy.carName();
		
	}
}

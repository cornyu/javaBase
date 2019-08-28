package base.proxy_sum;

import java.lang.reflect.Proxy;

import base.proxy_sum.cglibproxy.CGLibProxy;
import base.proxy_sum.dynamciproxy.DynamicProxy;
import base.proxy_sum.staticproxy.Hello;
import base.proxy_sum.staticproxy.HelloImpl;
import base.proxy_sum.staticproxy.HelloProxy;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//静态代理
		System.out.println("静态代理---------");
		HelloProxy helloProxy = new HelloProxy();
		helloProxy.say("yujy");
		
		System.out.println("动态代理---------jdk");
		//动态代理
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloDynamicProxy = (Hello) Proxy.newProxyInstance(
				hello.getClass().getClassLoader(),
				hello.getClass().getInterfaces(), 
				dynamicProxy);
		helloDynamicProxy.say("jack");
		
		System.out.println("动态代理---------cglib");
		//cglib 实现动态代理	
		Hello helloCGLIBProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
		helloCGLIBProxy.say("rose");
		
		
	}

}

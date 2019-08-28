package base.cglib;


import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


/**
 * @author cornyu
 * @version 创建时间：2018年3月23日 下午5:40:21 
 * 	利用cglib来实现 aop 功能
 *  cglib是针对类来实现代理的，原理是对指定的业务类生成一个子类，并覆盖其中业务方法实现代理。
 *  因为采用的是继承，所以不能对final修饰的类进行代理。 
 */
public class ProxyFactory implements MethodInterceptor {

	// 维护目标对象
	private Object target;

	public ProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("before");
		
		//Object result = method.invoke(object, args);
		
        proxy.invokeSuper(object, args); //调用业务类（父类中）的方法

        
		System.out.println("after");

		return null;
	}



}

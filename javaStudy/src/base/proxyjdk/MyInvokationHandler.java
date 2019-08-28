package base.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvokationHandler implements InvocationHandler {

	private Object target;
	
	public MyInvokationHandler(Object target) {
		super();
		this.target = target;
	}
	
	@Override
	public Object invoke(Object object, Method method, Object[] agrs) throws Throwable {
		System.out.println("------before--------");
	/*	System.out.println("invoke object:"+object);
		System.out.println("invoke method:"+method);
		System.out.println("invoke agrs:"+agrs);
*/
		Object result = method.invoke(target, agrs);
		System.out.println("------after------------");
		return result;
	}
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
		
	}

}

package base.proxy.aopFramework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import base.proxy.Advice;

public class ProxyFactoryBean {

	private Advice advice;
	private Object target;
	
	public Advice getAdvice() {
		return advice;
	}
	public void setAdvice(Advice advice) {
		this.advice = advice;
	}
	public Object getObject() {
		return target;
	}
	public void setObject(Object object) {
		this.target = object;
	}
	public Object getProxy() {
		Object proxy2 =  Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
						public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {

						System.out.println("methodName:" + method.getName());
						if (args != null) {
							for (Object obj : args) {
								System.out.println("method param:"
										+ obj.toString());
							}
						}
						advice.beforeAdvice();
						
						Object retVal = method.invoke(target, args);
						
						advice.afterAdvice();
						
						return retVal;
					}
				});
		return proxy2;
	}

}

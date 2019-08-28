package base.proxy_sum.dynamciproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author cornyu
 * 2018年1月3日
 * jdk 代理
 */
public class DynamicProxy implements InvocationHandler{
	
	private Object target;
	
	public DynamicProxy(Object obj)
	{
		this.target = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//System.out.println(proxy);
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}

	public void before()
	{
		System.out.println("before");
	}
	
	public void after()
	{
		System.out.println("after");
	}
	
	
	

}

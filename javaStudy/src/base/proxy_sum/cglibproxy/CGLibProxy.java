package base.proxy_sum.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @author cornyu
 * 2018年1月3日
 * cglib 代理
 */
public class CGLibProxy implements MethodInterceptor{
	
	private static CGLibProxy instance = new CGLibProxy();
	
	private CGLibProxy()
	{		
	}
	
	public static CGLibProxy getInstance()
	{
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> cls)
	{
		return (T) Enhancer.create(cls, this);
	}

//	intercept()方法拦截所有目标类方法的调用，
//	obj表示目标类的实例，
//	method为目标类方法的反射对象，
//	args为方法的动态入参，
//	proxy为代理类实例。
//	proxy.invokeSuper(obj, args)通过代理类调用父类中的方法。
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		before();
		Object result = proxy.invokeSuper(obj, args);
		after();		
		return result;
	}
	
	public void before()
	{
		System.out.println("cglib before");
	}
	
	public void after()
	{
		System.out.println("cglib after");
	}
	
	

}

package base.proxy;
/*
 *利用代理的知识    实现自己的 通知
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public abstract class ProxyTest3 {

	public static void main(String[] args) {
		 final ArrayList list = new ArrayList();
		 final MyAdvice advice = new MyAdvice();
		
		 Collection proxy2 = (Collection) getProxy(list, advice);
		
		 // 没调用一次方法就 调用一次invoke方法，所以proxy2.size==0;
		proxy2.add("1");
		proxy2.add("2");
		System.out.println("size:" + proxy2.size());
		System.out.println(proxy2.getClass().getName());
			
		
	}

	private static Object getProxy(final Object target,final Advice advice) {
		Object proxy2 =  Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				new InvocationHandler() {
						public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {

						System.out.println("methodName:" + method.getName());
						if (args != null) {
							for (Object obj : args) {
								System.out.println("method param:"+ obj.toString());
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

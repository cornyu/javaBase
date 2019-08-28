package base.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
/**
 * 
 * To create a proxy for some interface Foo: 

     InvocationHandler handler = new MyInvocationHandler(...);
     Class proxyClass = Proxy.getProxyClass(
         Foo.class.getClassLoader(), new Class[] { Foo.class });
     Foo f = (Foo) proxyClass.
         getConstructor(new Class[] { InvocationHandler.class }).
         newInstance(new Object[] { handler });
 
 or more simply: 
     Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                                          new Class[] { Foo.class },
                                          handler);
 *
 */
public class ProxyTest2 {

	public static void main(String[] args) throws Exception{
		
	/*	Class clazzProxy=Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		Constructor constructor=clazzProxy.getConstructor(InvocationHandler.class);
		Collection  collection=(Collection) constructor.newInstance(new InvocationHandler(){
			 @Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
			return null;
			}
		});*/
		Collection proxy2=(Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(),
										new Class[]{Collection.class}, 
			new InvocationHandler(){
				ArrayList list=new ArrayList();
				
				public Object invoke(Object proxy,
					Method method, Object[] args)throws Throwable {
					
					System.out.println("methodName:"+method.getName());
				if(args!=null){
					for(Object obj:args){
						System.out.println("method param:"+obj.toString());
						}
				}
				//计算时间
				long startTime= System.currentTimeMillis();
				Object retVal=method.invoke(list, args);
				long endTime=System.currentTimeMillis();
				System.out.println("time cost:"+(endTime-startTime));
				return retVal;
				}
		});
		//没调用一次方法就 调用一次invoke方法，所以proxy2.size==2;
		proxy2.add("1");
		proxy2.add("2");
		System.out.println("size:"+proxy2.size());
		System.out.println(proxy2.getClass().getName());
		
		
	
		
	}


}

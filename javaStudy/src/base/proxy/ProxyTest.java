package base.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class clazzProxy = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		System.out.println(clazzProxy.getName());
		
		System.out.println("----- constructor list start------");
		Constructor[] constructors=clazzProxy.getConstructors();
		for(Constructor constructor:constructors){
			String name=constructor.getName();
			
			StringBuilder sBuilder=new StringBuilder();
			sBuilder.append(name);
			sBuilder.append("(");
			Class[] clazzParams=constructor.getParameterTypes();
			for(Class clazzParam:clazzParams){
				sBuilder.append(clazzParam.getName()).append(",");
			}
			if(clazzParams!=null&&clazzParams.length>0){
				sBuilder.deleteCharAt(sBuilder.length()-1);
			}
			sBuilder.append(")");
			System.out.println(sBuilder.toString());
			
		}
		System.out.println("----- constructor list start------");
		
		
		System.out.println("----- method list start------");
		Method[] methods=clazzProxy.getMethods();
		for(Method method:methods){
			String name=method.getName();
			
			StringBuilder sBuilder=new StringBuilder();
			sBuilder.append(name);
			sBuilder.append("(");
			Class[] clazzParams=method.getParameterTypes();
			for(Class clazzParam:clazzParams){
				sBuilder.append(clazzParam.getName()).append(",");
			}
			if(clazzParams!=null&&clazzParams.length>0){
				sBuilder.deleteCharAt(sBuilder.length()-1);
			}
			sBuilder.append(")");
			System.out.println(sBuilder.toString());
			
		}
		System.out.println("----- method list end------");
	
	}

}

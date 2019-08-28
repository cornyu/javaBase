package base.proxy.aopFramework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import base.proxy.Advice;

public class BeanFactory {

	Properties props=new Properties();
	public BeanFactory(InputStream ips){
		try {
			props.load(ips);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getBean(String name) throws Exception{
		String classname=props.getProperty(name);
		
			Class clazz=Class.forName(classname);
			Object bean=clazz.newInstance();
			
			if(bean instanceof ProxyFactoryBean){
				Advice advice=(Advice) Class.forName(props.getProperty(name+".advice")).newInstance();
				Object target= Class.forName(props.getProperty(name+".target")).newInstance();
				((ProxyFactoryBean) bean).setAdvice(advice);
				((ProxyFactoryBean) bean).setObject(target);
				
				Object proxy=((ProxyFactoryBean)bean).getProxy();
				
				return proxy;
			}
			
		return bean;
	}
}

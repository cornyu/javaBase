package base.proxy.aopFramework;

import java.io.InputStream;
import java.util.Properties;

public class AopFrameTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		InputStream ips = AopFrameTest.class.getResourceAsStream("aopConfig.properties");
		
		Object bean = new BeanFactory(ips).getBean("list");
		System.out.println(bean.getClass().getName());
	
//		Properties props=new Properties();
//		props.load(ips);
//		String className=props.getProperty("list.target");
		
	}

}

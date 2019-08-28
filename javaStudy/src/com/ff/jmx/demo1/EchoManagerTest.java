package com.ff.jmx.demo1;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

/** 
* @author cornyu 
* @version 创建时间：2017年12月26日 下午2:55:55 
* 类说明 
*/
public class EchoManagerTest {

	public static void main(String[] args) throws Exception {
		// 创建MBeanServer   
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();   
           
        // 新建MBean ObjectName, 在MBeanServer里标识注册的MBean   
        ObjectName name = new ObjectName("com.ff.jmx.demo1:type=Echo1");   
           
        // 创建MBean   
        Echo mbean = new Echo();   
           
        // 在MBeanServer里注册MBean, 标识为ObjectName(com.tenpay.jmx:type=Echo)   
        mbs.registerMBean(mbean, name);   
  
           
        // 在MBeanServer里调用已注册的EchoMBean的print方法   
        mbs.invoke(name, "print", new Object[] { "cornyu jmx"}, new String[] {"java.lang.String"});   
           
       // Thread.sleep(Long.MAX_VALUE);   
		
	}

}

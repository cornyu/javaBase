package com.ff.jmx.demo2.client;

import java.util.Iterator;
import java.util.Set;

import javax.management.Attribute;
import javax.management.MBeanInfo;
import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import com.ff.jmx.demo2.HelloWorldMBean;

/**
 * @author cornyu
 * @version 创建时间：2017年12月26日 下午4:24:34 类说明
 */
public class ClientTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		int rmiPort = 1099;
		String jmxServerName = "TestJMXServer";
		JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:" + rmiPort + "/" + jmxServerName);
		
		//连接jmx
		JMXConnector jmxc = JMXConnectorFactory.connect(url);
		MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
		
		 //print domains
        System.out.println("Domains:------------------");
        String domains[] = mbsc.getDomains();
        for(int i=0;i<domains.length;i++){
            System.out.println("\tDomain["+i+"] = "+domains[i]);
        }
        
        //MBean count
        System.out.println("MBean count = "+mbsc.getMBeanCount());
        
        //process attribute 访问属性
        ObjectName mBeanName = new ObjectName(jmxServerName+":name=HelloWorld");
        
        mbsc.setAttribute(mBeanName, new Attribute("Name","yujy"));//注意这里是Name而不是name
        System.out.println("Name = "+mbsc.getAttribute(mBeanName, "Name"));
        
        //接下去是执行Hello中的printHello方法，分别通过代理和rmi的方式执行
        //via proxy
        HelloWorldMBean proxy = (HelloWorldMBean) MBeanServerInvocationHandler.newProxyInstance(mbsc, mBeanName, HelloWorldMBean.class, false);
        proxy.printHello();
        proxy.printHello("bad boy");
       
        //via rmi
        mbsc.invoke(mBeanName, "printHello", null, null);
        mbsc.invoke(mBeanName, "printHello", new String[]{"bad gril"}, new String[]{String.class.getName()});

        
      //get mbean information
        System.out.println("\n mbean information \n");
        MBeanInfo info = mbsc.getMBeanInfo(mBeanName);
        System.out.println("HelloWorld Class: "+info.getClassName());
        for(int i=0;i<info.getAttributes().length;i++){
            System.out.println("HelloWorld Attribute:"+info.getAttributes()[i].getName());
        }
        for(int i=0;i<info.getOperations().length;i++){
            System.out.println("HelloWorld Operation:"+info.getOperations()[i].getName());
        }

        
        //ObjectName of MBean
        System.out.println("all ObjectName:--------------");
        Set<ObjectInstance> set = mbsc.queryMBeans(null, null);
        for(Iterator<ObjectInstance> it = set.iterator();it.hasNext();){
            ObjectInstance oi = it.next();
            System.out.println("\t"+oi.getObjectName());
        }
        
        jmxc.close();
        
        
	}

}

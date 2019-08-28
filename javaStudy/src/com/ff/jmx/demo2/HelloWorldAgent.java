package com.ff.jmx.demo2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;

import com.sun.jdmk.comm.HtmlAdaptorServer;

/** 
* @author cornyu 
* @version 创建时间：2017年12月26日 下午3:03:28 
* 类说明 
*/
public class HelloWorldAgent {

	public static void main(String[] args) throws Exception {

		 int rmiPort = 1099;  
	        String jmxServerName = "TestJMXServer";  
	          
	        // jdk folder /bin/rmiregistry.exe 9999         
	        Registry registry = LocateRegistry.createRegistry(rmiPort);  
	  
	        MBeanServer mbs = MBeanServerFactory.createMBeanServer(jmxServerName);  
	        //MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();  
	      
	        HtmlAdaptorServer adapter = new HtmlAdaptorServer();  
	       
	        ObjectName adapterName;  
	        adapterName = new ObjectName(jmxServerName + ":name=" + "htmladapter");  
	        adapter.setPort(8082);  
	        adapter.start();  
	        mbs.registerMBean(adapter, adapterName);  
	  
	        ObjectName objName = new ObjectName(jmxServerName + ":name=" + "HelloWorld");  
	        mbs.registerMBean(new HelloWorld(), objName);  
	          
	  
	        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:" + rmiPort + "/" + jmxServerName);  
	        System.out.println("JMXServiceURL: " + url.toString());  
	        JMXConnectorServer jmxConnServer = JMXConnectorServerFactory.newJMXConnectorServer(url, null, mbs);  
	        jmxConnServer.start();  
	  
	}

}

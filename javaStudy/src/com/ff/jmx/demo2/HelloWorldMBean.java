package com.ff.jmx.demo2;
/** 
* @author cornyu 
* @version 创建时间：2017年12月26日 下午3:01:29 
* 类说明 
*/
public interface HelloWorldMBean {
	public String getName();          
    public void setName(String name);      
    public void printHello();         
    public void printHello(String whoName);  
}

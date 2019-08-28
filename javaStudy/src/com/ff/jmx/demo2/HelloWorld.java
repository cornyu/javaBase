package com.ff.jmx.demo2;
/** 
* @author cornyu 
* @version 创建时间：2017年12月26日 下午3:02:12 
* 类说明 
*/
public class HelloWorld implements HelloWorldMBean {

    private String name;      

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printHello() {
        System.out.println("Hello World, " + name);      
	}

	@Override
	public void printHello(String whoName) {
        System.out.println("Hello , " + whoName);      
	}

}

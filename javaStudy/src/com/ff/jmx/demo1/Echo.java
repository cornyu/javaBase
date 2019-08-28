package com.ff.jmx.demo1;
/** 
* @author cornyu 
* @version 创建时间：2017年12月26日 下午2:54:56 
* 类说明 
* 接下来是真正的资源对象，因为命名规范的限制，因此对象名称必须为Echo.
*/
public class Echo implements EchoMBean {

	@Override
	public void print(String yourName) {
		System.out.println("Hi " + yourName +"!");
	}

}

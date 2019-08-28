package com.ff.classloader.demo03;
/** 
* @author cornyu 
* @version 创建时间：2018年11月13日 下午9:34:01 
* 类说明 
*/
public class Test {

	static {
		 i=0;      //正常
		 //System.out.println(i); //报错，
	}
	static int i=1;
}

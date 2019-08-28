package com.ff.httpclient31;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.methods.GetMethod;

/** 
* @author cornyu 
* @version 创建时间：2019年3月13日 上午9:38:19 
* 类说明 
*/
public class TestHttpClient31 {

	public static void main(String[] args) {
		
		String url = "http://www.baidu.com";
		 //发送请求即可
        org.apache.commons.httpclient.HttpClient httpclient = new org.apache.commons.httpclient.HttpClient();
        GetMethod httpget = new GetMethod(url);
        System.out.println("======url:" + url);
        try {
            httpclient.executeMethod(httpget);
            String responseStr =  httpget.getResponseBodyAsString();
           // System.out.println(responseStr);
            printlnCookies(httpclient.getState().getCookies());
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
        } finally {
            httpget.releaseConnection();
        }
		
	}

	private static void printlnCookies(Cookie[] cookies) {
		for(Cookie cookie:cookies) {
			System.out.println("name:"+cookie.getName()+", value:"+cookie.getValue()+", domain:"+cookie.getDomain()
			+ ",path: "+cookie.getPath()
			+ ",version:"+cookie.getVersion());

		}
	}

}

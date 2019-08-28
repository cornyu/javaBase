package base.io.demo;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/** 
* @author cornyu 
* @version 创建时间：2018年12月21日 下午6:52:26 
* 类说明 
*/
public class IOClient {

	public static void main(String[] args) {
		 new Thread(() -> {
	            try {	            	
	                Socket socket = new Socket("127.0.0.1", 8000);
	                while (true) {
	                    try {
	                    		
	                        socket.getOutputStream().write((new Date() + ": hello world").getBytes());
	                        Thread.sleep(2000);
	                    } catch (Exception e) {
	                    }
	                }
	                
	            } catch (IOException e) {
	            	System.out.println("connect fail");
	            }
	        }).start();
	    }
}

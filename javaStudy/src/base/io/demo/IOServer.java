package base.io.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** 
* @author cornyu 
* @version 创建时间：2018年12月21日 下午6:50:14 
* 类说明 
*/
public class IOServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(8000);
		while (true) {
            try {
                // (1) 阻塞方法获取新的连接
                Socket socket = serverSocket.accept();
                System.out.println("serverSocket:"+socket);
                // (2) 每一个新的连接都创建一个线程，负责读取数据
                new Thread(() -> {
                    try {
                        int len;
                        byte[] data = new byte[1024];
                        InputStream inputStream = socket.getInputStream();
                        // (3) 按字节流方式读取数据
                        while ((len = inputStream.read(data)) != -1) {
                            System.out.println(new String(data, 0, len));
                        }
                    } catch (IOException e) {
                    }
                }).start();

            } catch (IOException e) {
            		System.out.println("server exception:"+e);
            }

        }
		

//	        // (1) 接收新连接线程
//	        new Thread(() -> {
//	            while (true) {
//	                try {
//	                    // (1) 阻塞方法获取新的连接
//	                    Socket socket = serverSocket.accept();
//
//	                    // (2) 每一个新的连接都创建一个线程，负责读取数据
//	                    new Thread(() -> {
//	                        try {
//	                            int len;
//	                            byte[] data = new byte[1024];
//	                            InputStream inputStream = socket.getInputStream();
//	                            // (3) 按字节流方式读取数据
//	                            while ((len = inputStream.read(data)) != -1) {
//	                                System.out.println(new String(data, 0, len));
//	                            }
//	                        } catch (IOException e) {
//	                        }
//	                    }).start();
//
//	                } catch (IOException e) {
//	                }
//
//	            }
//	        }).start();
	    
	        
	        
	    }
}

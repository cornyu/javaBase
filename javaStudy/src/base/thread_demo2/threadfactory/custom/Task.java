package base.thread_demo2.threadfactory.custom;

import java.util.concurrent.TimeUnit;

/** 
* @author cornyu 
* @version 创建时间：2017年12月27日 上午9:53:44 
* 类说明 
*/
public class Task implements Runnable {

	@Override
	public void run() {
		 try  
	      {  
	         TimeUnit.SECONDS.sleep(2);  
	      } catch (InterruptedException e)  
	      {  
	         e.printStackTrace();  
	      }  
	}

}

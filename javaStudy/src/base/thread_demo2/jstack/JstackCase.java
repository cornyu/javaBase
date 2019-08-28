package base.thread_demo2.jstack;
/** 
* @author cornyu 
* @version 创建时间：2018年8月5日 下午5:39:49 
* 类说明 
*/

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;



public class JstackCase {
	public static Executor executor = Executors.newFixedThreadPool(150);
	public static Object lock = new Object();
	
	public static void main(String args[]) {
		Task task1 = new Task();
		Task task2 = new Task();
		
		executor.execute(task1);
		executor.execute(task2);
		
//		for(int i=0;i<100;i++) {
//			executor.execute(new Task());
//		}
		
	}
	
	static class Task implements Runnable{

		@Override
		public void run() {
			synchronized (lock) {
				calcute();
			}
		}
		
		public void calcute() {
			int i=0;
			while(true) {
				i = i++;
			}
		}
		
	}
	
}

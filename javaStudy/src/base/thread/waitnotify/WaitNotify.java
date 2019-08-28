package base.thread.waitnotify;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cornyu
 * 等待通知机制实例
 */
public class WaitNotify {

	static boolean flag = true;
	static Object lock = new Object();
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		Thread  waitThread = new Thread(new Wait(),"waitThread");
		waitThread.start();
		
		Thread.currentThread().sleep(5000);
		
		Thread notifyThread = new Thread(new Notify(),"notifyThread");
		notifyThread.start();
		
	}
	
	static class Wait implements Runnable{

		@Override
		public void run() {
			synchronized (lock) {
				while(flag){
					System.out.println(Thread.currentThread()+"flag is true. wait @"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
				System.out.println(Thread.currentThread()+"flag is false. wait @"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
			}
		}
		
	}
	
	static class Notify implements Runnable{

		@Override
		public void run() {
			synchronized (lock) {
				System.out.println(Thread.currentThread()+"hold lock. notify @"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
				lock.notifyAll();
				flag = false;
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		
			synchronized (lock) {
				System.out.println(Thread.currentThread()+"hold lock again. notify sleep @"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}
		
	}
	

}

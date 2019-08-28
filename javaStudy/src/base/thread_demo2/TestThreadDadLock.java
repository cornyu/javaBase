package base.thread_demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//测试线程死锁
public class TestThreadDadLock {

	public static void createBusyThread()
	{
		Thread thread = new Thread(new Runnable() {		
			@Override
			public void run() {
				System.out.println(Thread.currentThread());

				while(true);
			}
		},"testBusyGhread");
		thread.start();
	}
	
	public static void createLockThread(final Object obj)
	{
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() 
			{
				System.out.println(Thread.currentThread());
				synchronized (obj)
				{
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("end");

			}
		},"testLockThread");		
		thread.start();
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println(Thread.currentThread());

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		createBusyThread();
		bf.readLine();
		Object obj = new Object();		
		createLockThread(obj);

	}

}

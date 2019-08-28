/**
 * 
 */
package base.thread.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author cornyu
 * Semaphore 用来控制同时访问特定资源的线程数量；
 * 
 */
public class SemaPhoreTest {
	
	private static final int THREAD_COUNT = 30;
	private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
	
	private static Semaphore semaphore = new Semaphore(10);
	
	public static void main(String[] args) {
		
		for(int i=0;i<THREAD_COUNT;i++){
			
			threadPool.execute(new Runnable() {				
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println("执行任务 "+Thread.currentThread());
						semaphore.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}					
				}
			});
			
		}
		threadPool.shutdown();
		
	}

}

/** 代码中虽然有30个线程在执行，但是只允许10个并发执行；
*/
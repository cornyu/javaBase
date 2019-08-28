package base.thread.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Exchanger用于线程间的数据交换，它提供一个同步点，两个线程可以彼此交换数据。
 * 这两个线程通过exchange方法交换数据
*/
public class ExchangerTest {

	private static final Exchanger<String> exgr = new Exchanger<String>();
	private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {
		threadPool.execute(new Runnable() {			
			@Override
			public void run() {
				String A = "我是线程A";
				try {
					exgr.exchange(A);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		threadPool.execute(new Runnable() {			
			@Override
			public void run() {
				String B = "我是线程B";
				try {
					String result = exgr.exchange(B);
					System.out.println(Thread.currentThread() +B+"  receive data:"+ result);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		threadPool.shutdown();
	}

}

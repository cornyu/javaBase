package base.thread.threadLocal.custom;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @author cornyu 
* @version 创建时间：2018年7月18日 上午10:31:08 
* 类说明 
*/
public class MainTest {

	public static void main(String[] args) {
		
		threadLocalTest();
		
		myThreadLocalTest();
		
		subAndThreadLocalTest();
		
		threadPoolThreadLocalTest();
			
	}

	public static void threadLocalTest() {
		ThreadLocal t1 = new ThreadLocal<String>();
		t1.set("主线程私有变量");
		System.out.println("当前线程名(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
	}
	
	public static void myThreadLocalTest() {
		MyThreadLocal mt1 = new MyThreadLocal<String>();
		mt1.set("MOCK");
		System.out.println("当前线程名(currentThread)-"+Thread.currentThread().getName()+":"+mt1.get());
	}
	
	//当我们创建一个线程,在线程内有去运行另一个线程的时候，作为子线程，如何去拿到父线程的私有属性呢?  InheritableThreadLocal
	public static void subAndThreadLocalTest() {
		//final ThreadLocal t1 = new ThreadLocal<String>();
		final ThreadLocal t1 = new InheritableThreadLocal<String>();//子线程可以继承父线程的私有变量

		new Thread(new Runnable() {		
			@Override
			public void run() {
				t1.set("父线程私有变量");
				System.out.println("父线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
				
				//子线程
				new Thread(new Runnable() {				
					@Override
					public void run() {
						System.out.println("子线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
					}
				}).start();
				
			}
		}).start();		
	}
	
	/*为什么会遇到这个问题呢? 是因为在线程池中核心线程用完，并不会直接被回收,而是返回到线程池中，既然是重新利用，
那么就不会重新创建线程，不会创建线程，父子之间就不会传递(如果这点没有明白,请继续看上面父子线程)。
那么这时父子线程关系的ThreadLocal值传递已经没有意义。
*/
	public static void threadPoolThreadLocalTest() {

		final ThreadLocal  t1 = new InheritableThreadLocal();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		executorService.execute(new Runnable() {			
			@Override
			public void run() {
				t1.set("Mock");
				System.out.println("当前线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
			}
		});
		
		executorService.execute(new Runnable() {			
			@Override
			public void run() {
				System.out.println("当前线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
			}
		});
				
		executorService.execute(new Runnable() {			
			@Override
			public void run() {
				System.out.println("当前线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
			}
		});
		
		executorService.execute(new Runnable() {			
			@Override
			public void run() {
				System.out.println("当前线程(currentThread)-"+Thread.currentThread().getName()+":"+t1.get());
			}
		});
		
		
	}
	
	
}

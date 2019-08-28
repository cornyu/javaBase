package base.thread_demo2.producterAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cornyu
 * @version 创建时间：2018年1月10日 下午6:45:42 类说明
 */
public class TestPC {

	public static void main(String[] args) throws InterruptedException  {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);
		Producer p1 = new Producer(queue);

		Consumer c1 = new Consumer(queue,p1);
		Consumer c2 = new Consumer(queue,p1);
		Consumer c3 = new Consumer(queue,p1);

		new Thread(p1).start();

		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(c1);
		service.execute(c2);
		service.execute(c3);

		System.out.println("已经开启所有的子线程");
		
		
		System.out.println("shutdown()：启动一次顺序关闭，执行以前提交的任务，但不接受新任务。");
		
		while (true) {
			if (!p1.isRunning &&  queue.isEmpty() ) {
				System.out.println("所有的任务都已经都已经生产完成");
				break;
			}
		}
		
		service.shutdown();
        System.out.println("shutdown()：启动一次顺序关闭，执行以前提交的任务，但不接受新任务。");  

		Thread.currentThread().sleep(3000);
		System.out.println("ExecutorService状态1："+service.isTerminated());

		 while(true){  
	            if(service.isTerminated()){  
	                System.out.println("所有的子线程都结束了！");  
	                break;  
	            }  
	            Thread.sleep(2000);    
	     }  

		
		 
		 service.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("测试");
			}
		});
	
			System.out.println("ExecutorService状态2："+service.isTerminated());

}

}

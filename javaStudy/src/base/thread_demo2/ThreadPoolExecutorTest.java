package base.thread_demo2;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/** 
* @author cornyu 
* @version 创建时间：2018年12月21日 下午2:30:38 
* 类说明 
* ThreadPoolExecutor 执行异步任务
*/
public class ThreadPoolExecutorTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 10l, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
		System.out.println("开始执行多线程");
		Future<Map> future = (Future<Map>) executor.submit(new Task());
		//System.out.println(future.get());
		System.out.println("主线程执行完");
		executor.shutdown();
	}

}


class Task extends Thread{
	public void run() {
		Thread currThread = Thread.currentThread();
		System.out.println(currThread.getName()+";"+currThread.getThreadGroup()+";"+currThread.getId()+"--开始执行");
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currThread.getName()+";"+currThread.getThreadGroup()+";"+currThread.getId()+"--执行完");

	}
}
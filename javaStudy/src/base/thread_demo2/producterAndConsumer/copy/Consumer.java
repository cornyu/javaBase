package base.thread_demo2.producterAndConsumer.copy;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * @author cornyu
 * @version 创建时间：2018年1月10日 下午6:42:27 类说明
 */
public class Consumer implements Runnable {

	private BlockingQueue<String> queue;
	private static final int SLEEPTIME = 2000;
	
	private Producer producer;

	public Consumer(BlockingQueue<String> queue,Producer producer) {
		this.queue = queue;
		this.producer = producer;
	}

	@Override
	public void run() {
		 System.out.println("start Consumer id :"+Thread.currentThread().getId());
	        Random r = new Random();
	        try{
	            while(producer.isRunning || !queue.isEmpty()){
	                String data = queue.take();
	                if(data != null)
	                {
	                    Thread.sleep(r.nextInt(SLEEPTIME));

	                    System.out.println("消费者:"+Thread.currentThread().getId()+"+正在处理："+data);
	                }
	            }
	        }catch (InterruptedException e) {
	            e.printStackTrace();
	            Thread.currentThread().interrupt();
	        }
	}

}

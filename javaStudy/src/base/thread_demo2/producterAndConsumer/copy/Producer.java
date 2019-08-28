package base.thread_demo2.producterAndConsumer.copy;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/** 
* @author cornyu 
* @version 创建时间：2018年1月10日 下午6:35:56 
* 生产者 
*/
public class Producer implements Runnable{

    public volatile boolean isRunning = true;
    private BlockingQueue<String> queue;// 内存缓冲区
    private static AtomicInteger count = new AtomicInteger();// 总数 原子操作
    private static final int SLEEPTIME = 1000;
	
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    
	@Override
	public void run() {
		String data=null;
        Random r = new Random();
        System.out.println("start producting id:" + Thread.currentThread().getId());
        try {
            for (int i=0;i<10;i++) {
            
                Thread.sleep(r.nextInt(SLEEPTIME));
                data = String.valueOf(count.incrementAndGet());
                System.out.println(data + " 加入队列");

                queue.put(data);//如果队列满，会一直阻塞
//                if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
//                    System.err.println(" 加入队列失败");
//                }
            }
            
            stop();
            
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
	}
	
	public void stop() {
        isRunning = false;
    }

}

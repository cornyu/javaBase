package base.thread.countdownlacth;

import java.util.concurrent.CountDownLatch;
///*
// *  CountDownLatch 可以实现类似 join的功能，并且join的功能更多。
///

public class CountDownLatchTest {

	static CountDownLatch countDownLatch = new CountDownLatch(2);
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("step 1");
				countDownLatch.countDown();
				
				System.out.println("step 2");
				countDownLatch.countDown();
				
			}
		});
		
		thread.start();
		countDownLatch.await();
		
		System.out.println("step 3");		
		
	}

}

package base.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/** 
 * @author cornyu 
 * @version 创建时间：2017-12-19 下午5:18:49 
 * 类说明 
 */
//public class CyclicBarrierTest {
//
//	static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
//	
//	public static void main(String[] argsStrings) {
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					cyclicBarrier.await();
//				} catch (Exception e) {
//					e.printStackTrace();
//				} 
//				System.out.println("1");
//			}
//			
//		}).start();
//		
//		try {
//			cyclicBarrier.await();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		
//		System.out.println("2");
//		
//	}
//=======
///**
// * 
// */
//package base.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author cornyu
 *	CyclicBarrier 让一组的线程到达一个屏障，时被阻塞，直到最后一个线程到达屏障，屏障才会开门，所有被屏障拦截的线程才会继续进行。
 *
 *	由于主线程和子线程都是由CPU调度，两个线程都有可能先执行，所以可能会有 两个结果。
 *  step 1
	step 2
	或者 
	step 2
	step 1
 *  
 */
public class CyclicBarrierTest {
	
	static CyclicBarrier cyclicBarrier =  new CyclicBarrier(2);

	public static void main(String[] args) {
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				try {
					System.out.println("step 1");

					cyclicBarrier.await();
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		}).start();
		

		try {
			cyclicBarrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("step 2");

		
	}

}

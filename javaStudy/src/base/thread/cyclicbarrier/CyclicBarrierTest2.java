package base.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author cornyu
 * @version 创建时间：2017-12-19 下午5:24:20 类说明
 */
//public class CyclicBarrierTest2 {
//
//	static CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
//
//	public static void main(String[] args) {
//		Thread thread = new Thread(new Runnable() {
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
//		});
//		thread.start();
//		thread.interrupt();
//		
//		try {
//			cyclicBarrier.await();
//		} catch (Exception e) {
//			
//			System.out.println(cyclicBarrier.isBroken());
//
//			e.printStackTrace();
//		} 
//		
import java.util.concurrent.CyclicBarrier;

/**
 *  new CyclicBarrier(2, new A()) 所有线程达到屏障时，优先执行A
 *  
*/
public class CyclicBarrierTest2 {

	static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new A());
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
		
		System.out.println("step 2");
		
		try {
			cyclicBarrier.await();
		} catch (Exception e) {
			e.printStackTrace();
		} 

		
	}
	
	static class A implements Runnable{

		@Override
		public void run() {
			System.out.println("step 3");
		}
		
	}

}

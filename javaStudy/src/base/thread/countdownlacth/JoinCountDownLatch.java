package base.thread.countdownlacth;

/**
 * @author cornyu
 *         假设有这个一个需求：我们需要解析一个Excel里多个sheet的数据，可以考虑用多线程，每个线程会给你解析一个sheet里的数据，等到所有的sheet解析完成后，
 *         程序提示解析完成。
 */
public class JoinCountDownLatch {

	public static void main(String[] args) throws InterruptedException {

		Thread parse1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("parse 1");
			}
		});

		Thread parse2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("parse 2");
			}
		});
		
		parse1.start();
		parse2.start();
		parse1.join();
		parse2.join();
		System.out.println("all parse finish");

	}

}

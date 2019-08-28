/**
 * 
 */
package base.thread.shutdown;

/**
 * @author cornyu 安全的终止线程 除了中断以外，还可以利用一个boolean变量来控制是否需要停止任务并终止该线程。
 */
public class ShutDownThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		// 第一种：通过调用线程的 interrupt
		Runner one = new Runner();
		Thread thread = new Thread(one, "CountThread");
		thread.start();
		Thread.currentThread().sleep(1000);
		thread.interrupt();

		// 第二种：通过 volatile 变量
		Runner two = new Runner();
		thread = new Thread(two, "CountThread");
		thread.start();
		Thread.currentThread().sleep(2000);
		thread.interrupt();

	}

	private static class Runner implements Runnable {
		private long i;
		private volatile boolean on = true;

		@Override
		public void run() {
			while (on && !Thread.currentThread().isInterrupted()) {
				i++;
			}
			System.out.println("Count i=" + i);

		}

		public void cancel() {
			on = false;
		}

	}

}

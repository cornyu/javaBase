package base.thread_demo2;

public class TraditionalThreadSynchronized {
	
	public static void main(String[] args) {
		new TraditionalThreadSynchronized().init();
	}

	
	public void init() {

		new Thread(new Runnable() {
			public void run() {
				Outputer outputer = new Outputer();

				while (true) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					outputer.output("ABCDEFGHIJKLNOPQRST");
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				Outputer outputer = new Outputer();

				while (true) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					outputer.output("abcdefghijklmnopqrst");
				}
			}
		}).start();
	}

	class Outputer {
		public void output(String name) {
			int len = name.length();
			synchronized (Outputer.class) {
				for (int i = 0; i < len; i++) {
					System.out.print(name.charAt(i));
				}
				System.out.println();
			}
		}
	}

}

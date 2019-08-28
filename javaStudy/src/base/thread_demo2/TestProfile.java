package base.thread_demo2;

public class TestProfile extends Thread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		TestProfile t = new TestProfile();
		for (int i = 1; i < 10000; i++) {
			new HelloWorld();
			t.sleep(100); // 休眠100毫秒
		}
	}
}

class HelloWorld {
	public HelloWorld() {
		System.out.println("Hello Jayzee! " + Thread.currentThread().toString());
	}
}

package base.thread.threadLocal.demo1;

/**
 * @author cornyu
 * @version 创建时间：2018年9月9日 上午10:08:58 
 * 
 * ThreadLocal 基本使用方法
 * 1.通过threadLocal创建的对象副本都是存放在线程自己的threadLocals中；
 * 2.为何threadLocals的类型ThreadLocalMap的键值为ThreadLocal对象，
 * 因为每个线程中可有多个threadLocal变量，就像代码中的longLocal和stringLocal
 * 
 * 3.在进行get之前，必须先set，否则会报空指针异常；
	如果想在get之前不需要调用set就能正常访问的话，必须重写initialValue()方法。


 */
public class BaseTest {

	ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
	ThreadLocal<String> stringLocal = new ThreadLocal<String>();

	public void set() {
		longLocal.set(Thread.currentThread().getId());
		stringLocal.set(Thread.currentThread().getName());
	}

	public long getLong() {
		return longLocal.get();
	}

	public String getString() {
		return stringLocal.get();
	}

	public static void main(String[] args) throws InterruptedException {
		final BaseTest test = new BaseTest();

		test.set();
		System.out.println(test.getLong());
		System.out.println(test.getString());

		Thread thread1 = new Thread() {
			public void run() {
				test.set();
				System.out.println(test.getLong());
				System.out.println(test.getString());
			};
		};
		thread1.start();
		thread1.join();

		System.out.println(test.getLong());
		System.out.println(test.getString());
	}

}

package base.thread_demo2;

import java.util.Timer;
//总结：查看Thread类的run()方法的源代码，可以看到其实这两种方式都是在调用Thread
//对象的run()方法，如果Thread类的run方法没有被覆盖，并且为该Thread对象设置了一个
//Runnable对象，该run方法会调用Runnable对象的run方法。
//即是先运行的Thread对象的run方法，如果Thread对象没有重写run方法，就去运行Runnable的run方法。
//
//两种方式的区别：
//给Thread类传入Runnable接口可以实现数据共享，而且更偏向于面向对象的编程思想，所以
//使用第二种比较多。
import java.util.TimerTask;

public class ThreadTests {

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("Thread Runing 01...");
				super.run();
			}
		}.start();

		new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread Runing 02...");
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread Runing in Runnable...");
			}
		}) {
			public void run() {
				System.out.println("Thread Runing in Parent Thread...");
			}
		}.start();

		new Thread_01().start();
		new Thread_02().run();

		// 定时器任务
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Timer Running...");
			}
		}, 1000);

		// new Timer().schedule(new TimerTask(){
		// @Override
		// public void run() {
		// System.out.println("Timer Running..."+System.currentTimeMillis());
		// }
		// },1000,2000);

	}

}

class Thread_01 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread_01 Runing in Runnable...");

	}
}

class Thread_02 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread_02 Runing in Runnable...");
	}
}

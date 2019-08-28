package base.thread_demo2;
/** 
* @author cornyu 
* @version 创建时间：2018年1月12日 上午10:41:12 
* 类说明 
* daemon 和普通线程的区别
* 用户线程不完，jvm系统就不完，要是想只运行"精灵Daemon线程",对不起jvm不给面子，不伺候，就关闭了，不给"精灵Daemon线程"们单独运行的机会。
* 这句话比较难理解，我换一句话来说这件事。当一个应用程序的所有非精灵线程停止运行时，即使仍有精灵线程还在运行，该应用程序也将终止，反过来，只要还有非精灵线程在运行，应用程序就不会停止。我们可以通过setDaemon(booleanon)来设置某线程为精灵线程。
* 用isDaemon（）来判断某线程是否为精灵线程或守护线程。注意：要想设置一个线程为精灵守护线程，setDaemon必须在start前调用。 
* 
*/


public class TestDaemon {

	public static void main(String args[]) {
		
		SecurityManager securityManager  = System.getSecurityManager();
		ThreadGroup group = (securityManager == null)?Thread.currentThread().getThreadGroup():securityManager.getThreadGroup();
		
		Thread handleTask = new Thread(group,new RunTask(),"1");
		
		handleTask.setDaemon(true);//如果设置为 daemon线程，则会执行完就停止；如果不设置为daemon，则程序会一只执行下去；
		handleTask.start();	
			
	}
	
}

class RunTask implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("1");
		}
	}
	
}

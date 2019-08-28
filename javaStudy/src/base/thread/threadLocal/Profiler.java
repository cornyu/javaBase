/**
 * 
 */
package base.thread.threadLocal;


/**
 * @author cornyu
 *	ThreadLocal demo
 */
public class Profiler {
	private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>(){
		protected Long initialValue() {
			System.out.println("threadlocal init");
			return System.currentTimeMillis();
		}
	};
	
	public static final void begin(){
		System.out.println("begin init");

		TIME_THREADLOCAL.set(System.currentTimeMillis());
	}
	
	public static final Long end()
	{
		System.out.println("end init");
		return System.currentTimeMillis() - TIME_THREADLOCAL.get();
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		Profiler.begin();
		Thread.currentThread().sleep(2000);	
		System.out.println("Cost:"+Profiler.end()+" mills");
	}

}

package base.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/**
 * @author cornyu
 * Mutex 是一个独占锁，使用Mutex时并不会和其内部类打交道，而是调用Mutex的方法。
 */
public class Mutex implements Lock{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static class Sync extends AbstractQueuedSynchronizer{
		//是否处于占用状态
		protected boolean isHeldExclusively(){
			return getState()==1;
		}
		
		//当状态为0 时 获取锁
		public boolean tryAcquire(int acquires){
			if(compareAndSetState(0, 1)){
				setExclusiveOwnerThread(Thread.currentThread());
				return true;
			}
			return false;
		}
		
		//释放锁，将状态设置为0
		protected boolean tryRelease(int release) {
			if(getState()==0) throw new IllegalMonitorStateException();
			setExclusiveOwnerThread(null);
			setState(0);
			return true;
		}
		
		//返回一个Conditon ,每个conditon都包含了一个conditon队列
		Condition newConditon(){
			return new ConditionObject();
		}
	}
	
	private final Sync sync = new Sync();

	public boolean isLocked() {
		return sync.isHeldExclusively();
	}
	
	@Override
	public void lock() {
		sync.acquire(1);
	}
	
	@Override
	public boolean tryLock() {
		return sync.tryAcquire(1);
	}

	@Override
	public void unlock() {
		sync.release(0);
	}
	
	@Override
	public void lockInterruptibly() throws InterruptedException {
		sync.acquireInterruptibly(1);
	}

	@Override
	public Condition newCondition() {
		return sync.newConditon();
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return sync.tryAcquireNanos(1, unit.toNanos(time));
	}



}

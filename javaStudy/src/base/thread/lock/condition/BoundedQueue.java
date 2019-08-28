/**
 * 
 */
package base.thread.lock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cornyu
 * 利用Conditon来创建一个 有界队列，当队列为空时，队列的获取操作将会阻塞获取线程，直到队列中新增元素，当队列
 * 已满时，队列的插入操作将会阻塞插入线程，直到队列出现“空位”。
 */
public class BoundedQueue<T>{
	private Object[] items;
	
	private int addIndex,removeIndex,count;
	
	private Lock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();
	
	public BoundedQueue(int size){
		items = new Object[size];
	}
	
	public void add(T t) throws InterruptedException{
		lock.lock();
		try {
			while(count == items.length){
				notFull.await();				
			}
			items[addIndex] = t;
			if(++addIndex == items.length)
				addIndex = 0;
			++count;
			notEmpty.signal();
		}
		finally {
			lock.unlock();
		}
	}
	
	public T remove() throws InterruptedException{
		lock.lock();
		try {
			while(count==0){
				notEmpty.await();
			}
			Object xObject = items[removeIndex];
			if(removeIndex == items.length)
				removeIndex = 0;
			--count;
			notFull.signal();
			return (T)xObject;
			
		}finally {
			lock.unlock();
		}
	}
	
	
	
}

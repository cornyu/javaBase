package com.ff.classloader.demo02;


/** 
* @author cornyu 
* @version 创建时间：2018年11月5日 下午5:20:02 
* 类说明 
* 
*    /*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
          /* Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("A sub Thread run ");
				}
			});
            thread.setName("A sub Thread");
            thread.setDaemon(true);
            thread.start();
            */

public class TestClassLoaderLock {

	public static class A {
        static {
            System.out.println("class A init start.");           
            B b = new B();
            System.out.println("class A init end");
        }   
        
        public static void test() {
            System.out.println("method test called in class A");
        }
    }
    
    public static class B {       
        static {
            System.out.println("class B init start.");
            A a = new A();
            System.out.println("class B init end.");
        }
        
        public static void test() {
            System.out.println("method test called in class B");
        }
    }


	public static void main(String[] args) {
		
			new Thread(new Runnable() {
	            @Override
	            public void run() {
	                A.test();
	            }       
	        }).start();
	            
	        new Thread(new Runnable() {
	            @Override
	            public void run() {
	                B.test();
	            }       
	        }).start();
	}

}

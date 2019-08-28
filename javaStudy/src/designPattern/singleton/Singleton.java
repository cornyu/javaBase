package designPattern.singleton;

/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-16 下午2:54:37 
 *  单例
 */
public class Singleton {

	private static Singleton instance = null;
	 
	/* 私有构造方法，防止被实例化 */ 
	private Singleton(){		
	}
	
	public synchronized static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();			
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */    
	public Object readResolve() {  
        return instance;  
    }  

    	
//	public static void main(String[] args) {
//		System.out.println(new Singleton());
//		System.out.println(new Singleton());
//
//		System.out.println(Singleton.getInstance());
//		System.out.println(Singleton.getInstance());
//
//	}

}

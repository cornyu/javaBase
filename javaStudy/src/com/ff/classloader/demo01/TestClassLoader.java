package com.ff.classloader.demo01;



/**
 * @author cornyu
 * @version 创建时间：2018年10月23日 下午5:21:36 类说明
 */
public class TestClassLoader {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		System.out.println("context classLoader:"+Thread.currentThread().getContextClassLoader());
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("context classLoader:"+Thread.currentThread().getContextClassLoader());

			}
		}).start();
		
		System.out.println("---------------4-----------------");

/*
		ClassLoader loader = TestClassLoader.class.getClassLoader();
		System.out.println(loader.toString());
		System.out.println(loader.getParent().toString());
		System.out.println(loader.getParent().getParent());	
		System.out.println("---------------1------------------");
*/
		/*
		MyClassLoader classLoader = new MyClassLoader("/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/bin/");
		Class<?> clazz = classLoader.loadClass("com.ff.classloader.demo01.Test");
		Class<?> clazz2 = classLoader.loadClass("com.ff.classloader.demo01.Test");

		System.out.println("类加载器："+clazz.getClassLoader());
		System.out.println(clazz.equals(clazz2));//同一个类加载器，加同样的类全限定名
		
		System.out.println("---------------2-----------------");
		
		
		MyClassLoader classLoader_tmep = new MyClassLoader("/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/bin/");
		Class<?> clazzTemp = classLoader_tmep.findClass("com.ff.classloader.demo01.Test");
		System.out.println("类加载器："+clazzTemp.getClassLoader());
		System.out.println(clazz.equals(clazzTemp));///不同类加载器，同样的类全限定名
		
		System.out.println("---------------3-----------------");
		
		*/
		
		
		

		
		
		//加载外部工程的class文件
	/*	MyClassLoader classLoader_other = new MyClassLoader("/Users/cornyu/Downloads/javaweb/eclipse_workspace_20171109/ffutil/target/classes/");
		Class<?> clazz_ffutil = classLoader_other.loadClass("com.ff.ffutil.FFUtil");
		
		System.out.println("普通自定义类加载器："+clazz_ffutil.getClassLoader());
		Object testObj_ffutil = clazz_ffutil.newInstance();
		System.out.println(testObj_ffutil instanceof Test);
		System.out.println(testObj_ffutil);
		
		System.out.println("current context classloader:"+Thread.currentThread().getContextClassLoader());
*/
		
		
		
		
		
		
		
		
		/*Class<?> clazz_find = classLoader.findClass("com.ff.classloader.demo01.Test");
		
		System.out.println("普通自定义类加载器2："+clazz_find.getClassLoader());
		Object testObj2 = clazz_find.newInstance();
		System.out.println(testObj2 instanceof Test);
		System.out.println(testObj2);*/
        

		
	}
}




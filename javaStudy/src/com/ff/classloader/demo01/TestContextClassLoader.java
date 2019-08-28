package com.ff.classloader.demo01;

/**
 * @author cornyu
 * @version 创建时间：2018年11月3日 上午9:05:38 类说明
 */
public class TestContextClassLoader {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		System.out.println("current context classloader:" + Thread.currentThread().getContextClassLoader());

		MyClassLoader classLoader = new MyClassLoader(
				"/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/bin/");
		Class<?> clazz = classLoader.loadClass("com.ff.classloader.demo01.Test");

		System.out.println("类加载器：" + clazz.getClassLoader());
		Object testObj = clazz.newInstance();
		System.out.println(testObj instanceof Test);
		System.out.println(testObj);
		System.out.println("current context classloader:" + Thread.currentThread().getContextClassLoader());

		System.out.println("---------------------------------");
		System.out.println("Class.forName来获取某个类的Class");
		// Class类获取 某个具体的类的Class对象
		Class<?> clazzTest = Class.forName("com.ff.classloader.demo01.Test");
		System.out.println(clazzTest);
		System.out.println(clazzTest.getClassLoader());// sun.misc.Launcher$AppClassLoader@7d487b8b

		
		System.out.println("-----------------------------");
		// 如果我们在这里，获取和加载com.ff.ffutil.FFUtil,显然会失败，但是我们可以通过ContextClassLoader来改变当前的类加载器
		ClassLoader cLoader = Thread.currentThread().getContextClassLoader();

		// 新建一个classLoader 加载外部工程的class文件
		MyClassLoader classLoader_other = new MyClassLoader(
				"/Users/cornyu/Downloads/javaweb/eclipse_workspace_20171109/ffutil/target/classes/");
		
		Thread.currentThread().setContextClassLoader(classLoader_other);

		System.out.println("current context classloader:" + Thread.currentThread().getContextClassLoader());

		
		Class<?> clazzFFUtil = Class.forName("com.ff.ffutil.FFUtil",true,classLoader_other);
		System.out.println(clazzFFUtil.newInstance());
		System.out.println(clazzFFUtil.getClassLoader());
		

	}

}

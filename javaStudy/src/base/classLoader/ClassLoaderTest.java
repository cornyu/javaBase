package base.classLoader;

import java.util.Date;

/**
 * 类加载器
 * @author xiaoyu
 *
 */
public class ClassLoaderTest {

	/**
	 * 运行
	 */
	public static void main(String[] args) throws Exception{
		//获取类加载器的名称    sun.misc.Launcher$AppClassLoader
		System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getName());
		
		//null
		System.out.println(System.class.getClassLoader());
		System.out.println("##################");
		
		/*sun.misc.Launcher$AppClassLoader
		sun.misc.Launcher$ExtClassLoader
		null*/
		ClassLoader loader=ClassLoaderTest.class.getClassLoader();
		while(loader!=null){
			System.out.println(loader.getClass().getName());
			loader=loader.getParent();
		}
		System.out.println(loader);
		
		System.out.println("################");
		
		//这是运行正常
		//System.out.println(new ClassLoaderAttachment().toString());
		
		//使用自己的类加载器
		
		try {
			Class class1=new MyClassLoader("classLoaderLib").loadClass("ClassLoaderAttachment.class");
			//这里d1 必须是 Date 必须是 ClassLoaderAttachment的父类
			Date  d1=(Date) class1.newInstance();
			System.out.println(class1.newInstance().toString());
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}

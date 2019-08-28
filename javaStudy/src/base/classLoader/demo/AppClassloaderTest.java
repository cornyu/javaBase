package base.classLoader.demo;

/**
 * @author cornyu
 * @version 创建时间：2018年4月12日 下午1:31:37 
 * 类说明 :  AppClassloader 
 * 			应用类加载器，又称系统类加载器。它负责在 JVM
 *          启动时，加载来自在命令java中的-classpath或者 java.class.path系统属性或者 CLASSPATH
 *          操作系统属性所指定的 JAR 类包和类路径。 调用 ClassLoader.getSystemClassLoader()
 *          可以获取该类加载器。如果没有特别指定， 则用户自定义的任何类加载器都将该类加载器作为它的父加载器
 *          
 *          ExtClassloader
			扩展类加载器，主要负责加载 Java 的扩展类库，默认加载 JAVA_HOME/jre/lib/ext/ 目录下的所有 Jar 包
			或者由 java.ext.dirs 系统属性指定的 Jar 包。放入这个目录下的 Jar 包对 AppClassloader 加载器都是可见的
			（因为 ExtClassloader 是 AppClassloader 的父加载器，并且 Java 类加载器采用了委托机制)。	
			
			BootstrapClassloader
			引导类加载器，又称启动类加载器，是最顶层的类加载器，主要用来加载 Java 核心类，如 rt.jar、resources.jar、charsets.jar 等。
			需要注意的是它不是 java.lang.ClassLoader 的子类，而是由 JVM 自身实现的，
			该类为 C 语言实现，所以严格来说它不属于 Java 类加载器范畴，Java 程序访问不到该加载器。

 */
public class AppClassloaderTest {

	public static void main(String[] args) {
		/// Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Classes/classes.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Classes/ui.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Classes/jsse.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Classes/jce.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Classes/charsets.jar:/System/Library/Java/Extensions/MRJToolkit.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext/apple_provider.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext/sunpkcs11.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/bin:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/pdf/itext-2.0.6.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/pdf/itext-rtf-2.1.7.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/pdf/itextasian-1.5.2.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/pdf/itextpdf-5.1.2.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/aop-utils-common-1.0.0.2.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/aopalliance-1.0.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/cglib-2.2.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/cglib-3.2.4.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/com.springsource.org.aopalliance-1.0.0.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/org.objectweb.asm-3.3.1.v201105211655.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/spring-aop-4.1.0.RELEASE.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/lucene-core-6.3.0.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/jmx/jmxri-1.2.1.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/jmx/jmxtools-1.2.1.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/json/gson-2.8.2.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/json/fastjson-1.2.44.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/swt/swt-3.7-cocoa-macosx-x86_64.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/guava/guava-r09.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/javax/javaee-api-7.0.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/javassist/javassist-3.21.0-GA.jar:/Users/cornyu/Downloads/javaweb/gitcode/javaStudy/javaStudy/lib/spring/spring-core-4.2.2.RELEASE.jar

		System.out.println(System.getProperty("java.class.path"));

		//普通类的 类加载器
		ClassLoader cl = AppClassloaderTest.class.getClassLoader();		
		System.out.println(cl);// sun.misc.Launcher$AppClassLoader@20cf2c80
		System.out.println(cl.getParent());// sun.misc.Launcher$ExtClassLoader@1729854
		

	}

}

package test;
/** 
* @author cornyu 
* @version 创建时间：2018年1月22日 下午3:03:58 
* 类说明 
*/
public class FF {
	
	public static final String TEST="CR";
	
	public static void main(String ars[]) {
		final TestFinalObj finalObj = new TestFinalObj("1");
		//finalObj = new TestFinalObj("2");  //final 引用 非普通类型对象 时不允许重定向
		
		///Library/Java/Extensions:/System/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/ext
		System.out.println(System.getProperty("java.ext.dirs"));  

	}

}

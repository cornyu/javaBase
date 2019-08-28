package base.relfect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect6 {

	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		
        Class<?> clazz = Class.forName("com.ff.base.relfect.TestReflect6");
        Method method = clazz.getMethod("reflect1");
        method.invoke(clazz.newInstance());
        
        method = clazz.getMethod("reflect2", int.class, String.class);
        method.invoke(clazz.newInstance(), 20, "张三");


        
	}
	
	  	public void reflect1() {
	        System.out.println("Java 反射机制 - 调用某个类的方法1.");
	    }
	    public void reflect2(int age, String name) {
	        System.out.println("Java 反射机制 - 调用某个类的方法2.");
	        System.out.println("age -> " + age + ". name -> " + name);
	    }
}

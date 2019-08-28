package base.relfect;

import java.lang.reflect.Field;

public class TestReflect7 {
	private String proprety = null;
	public String name = null;

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("com.ff.base.relfect.TestReflect7");
		Object obj = clazz.newInstance();
		
		// 可以直接对 private 的属性赋值
		Field field = clazz.getDeclaredField("proprety");
		//field.setAccessible(true);
		field.set(obj, "Java反射机制");
		System.out.println(field.get(obj));
		
		Field fieldName = clazz.getDeclaredField("name");
		//field.setAccessible(true);
		fieldName.set(obj, "cornyu");
		System.out.println(fieldName.get(obj));
	}

}

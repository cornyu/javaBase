package base.relfect;

public class TestReflect1 {

	
	public static void main(String[] args) throws ClassNotFoundException {
		TestReflect1 test = new TestReflect1();
		//1. 通过一个对象获得完整的包名和类名
		//com.ff.base.relect.demo1.TestRelect1
		System.out.println(test.getClass().getName());
		
		//2. 实例化Class类对象
		 Class<?> class1 = null;
	        Class<?> class2 = null;
	        Class<?> class3 = null;
	        // 一般采用这种形式
	        class1 = Class.forName("com.ff.base.relect.demo1.TestRelect1");
	        class2 = new TestReflect1().getClass();
	        class3 = TestReflect1.class;
	        System.out.println("类名称   " + class1.getName());
	        System.out.println("类名称   " + class2.getName());
	        System.out.println("类名称   " + class3.getName());
	}

}

package interview.chap2;

/**
 * @author cornyu
 * @version 创建时间：2019年7月23日 下午6:08:26 类说明
 */
public class TestStaticVar {
	static int i = 0;
	
	public int aMethod() {
		//static int i = 0;//静态变量不能在方法内进行声明；
		i++;
		return i;
	}

	public static void main(String args[]) {
		TestStaticVar test = new TestStaticVar();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);
	}

}

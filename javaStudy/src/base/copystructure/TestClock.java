package base.copystructure;

/**
 * @author cornyu
 * @version 创建时间：2018年4月27日 下午8:41:56 
 * 
 * 拷贝构造函数 测试、
 * 
 */
public class TestClock {

	public static void main(String[] args) {

		Clock c1 = new Clock(6, 43, 23);
		Clock c2 = new Clock(c1);// 调用拷贝构造函数
		c1.printTime();
		c1.setTime(1, 1, 1);
		c1.printTime();

		c2.printTime();

	}

}

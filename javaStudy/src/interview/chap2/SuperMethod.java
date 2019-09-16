package interview.chap2;

/**
 * @author cornyu
 * @version 创建时间：2019年7月23日 下午6:11:14 类说明
 */

class Super {
	
	public Integer getLenght() {
		return new Integer(4);
	}
	
}

class Sub extends Super {
	
	/**
	 * 覆盖父类方法，不能改变返回值类型
	 */
//	public Long getLenght() {
//		return new Long(5);
//	}
	
	public Integer getLenght() {
		return  5;
	}

}

public class SuperMethod {

	public static void main(String[] args) {
		Super sooper = new Super();
		Sub sub = new Sub();
		System.out.println(sooper.getLenght().toString() + "," + sub.getLenght().toString());
	}

}

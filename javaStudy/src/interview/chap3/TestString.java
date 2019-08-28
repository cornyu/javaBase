package interview.chap3;
/** 
* @author cornyu 
* @version 创建时间：2019年7月29日 下午6:49:01 
* 类说明 
*/
public class TestString {

	public static void main(String[] args) {

		String a = "123";
		String b = "123";
		String c = new String("123");
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == c.intern());
		
		System.out.println(a.getClass());
		System.out.println(c.getClass());
				
		
	}

}

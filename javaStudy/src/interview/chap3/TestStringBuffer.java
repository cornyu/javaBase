package interview.chap3;
/** 
* @author cornyu 
* @version 创建时间：2019年8月11日 上午11:50:53 
* 类说明 
*/
public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");

		operator(a, b);
		System.out.println(a+","+b);
		b = a;
		System.out.println(b);
		
	
	
	}

	public static void operator(StringBuffer x,StringBuffer y) {
		x.append(y);//x = AB ,y = B
		y = x;
		//y = y.append(x);
	}
	
}

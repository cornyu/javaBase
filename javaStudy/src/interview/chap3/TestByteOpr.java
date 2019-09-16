package interview.chap3;
/** 
* @author cornyu 
* @version 创建时间：2019年8月17日 下午12:46:02 
* 类说明 
*/
public class TestByteOpr {

	public static void main(String[] args) {

		byte b1 =1,b2=2,b6;
		int b3;
		final byte b4=4,b5=5 ;

		b6= b4+b5;// 这里为啥呢？
		
		//b3=(b1+b2); //b1+b2结果为int类型
		
		b3=(b1+b2); 
		
		System.out.println(b3+b6);
		
		
	}

}

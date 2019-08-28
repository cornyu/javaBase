package interview.chap1;

/** 
* @author cornyu 
* @version 创建时间：2019年7月15日 上午11:29:14 
* 类说明 
*/
public class ExceptionReturn {

	public static void main(String[] args) {
		ExceptionReturn exceptionReturn = new ExceptionReturn();
		System.out.println(exceptionReturn.test(1, 0));
		
		  long temp=(int)3.9;
			System.out.println(temp);
			temp%=2;
			System.out.println(temp);

		
	}
	
	public int test(int a,int b) {
		testStatic();
		int result = 0 ;
		try {
			int c = a/b;
		}catch (Exception e) {
			System.out.println("exception return -1");
			return -1;
		} 
		finally {
			System.out.println("finally return 1");
			return 1;
		}		
	}
	
	public static void testStatic() {
		System.out.println("test");
	}

}

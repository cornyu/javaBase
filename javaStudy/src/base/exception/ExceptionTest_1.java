package base.exception;

//问题：下面代码会输出什么？
//异常  如果代码中对异常问题进行了处理，比如try catch,则catc后面的代码还是会执行；
//     如果不对异常 进行处理，则代码运行到异常的地方后程序就返回了，不往下执行；

public class ExceptionTest_1 {

	public static void main(String[] args) {
		try
		{
			int a = 0;
			int b = 3;
			System.out.println("1");
			int c = b/a;
			System.out.println("异常");
			//前面发生异常，跳转到catch 
			System.out.println("2");

			System.out.println("c:"+c);
		}
		catch(Exception e)
		{
			System.out.println("异常信息:"+e.toString());
		}
		System.out.println("3");
		System.out.println("正常流程");		
	}

}

package base.override;
/**
 * 重载 --静态分派
 * @author xiaoyu
 *
 */
public class OverloadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OverloadTest.sayHello('a');
	}

	public static void sayHello(Object arg){
		System.out.println("object");
	}
	
	public static void sayHello(int arg){
		System.out.println("int");
	}
	
	/*public static void sayHello(char arg){
		System.out.println("char");
	}*/
}

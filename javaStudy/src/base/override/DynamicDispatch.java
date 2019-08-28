package base.override;
/**
 * 动态分派--重写（override）
 * @author xiaoyu
 *
 */
public class DynamicDispatch {

	
	public static void main(String[] args) {
		Human man=new Man();
		Human womanHuman=new Woman();
		man.sayHello();
		womanHuman.sayHello();
		
		man=new Woman();
		man.sayHello();
		
		//int []a=new int[-1];
	}

	static abstract class Human{
		protected abstract void sayHello() ;
	}
	
	static class Man extends Human{

		@Override
		protected void sayHello() {
			System.out.println("man ");
		}
		
	}
	static class Woman extends Human{

		@Override
		protected void sayHello() {
			System.out.println("woman");
		}
		
	}
}

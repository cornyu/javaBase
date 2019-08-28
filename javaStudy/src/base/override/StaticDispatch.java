package base.override;
/**
 * 静态分派分派  重载（overload）的实现原理
 * p-249 深入理解java虚拟机 
 * @author xiaoyu
 *
 */
class Human {
}

class Man extends Human {
}

class Woman extends Human {
}

public class StaticDispatch {

	public static void main(String[] args) {
		StaticDispatch teStaticDispatch = new StaticDispatch();
		Human man = new Man();
		Human woman = new Woman();
		
		teStaticDispatch.sayHello(man);
		teStaticDispatch.sayHello(woman);
		
		teStaticDispatch.sayHello((Man)man);
		teStaticDispatch.sayHello((Woman)woman);
		
	}

	public void sayHello(Human guy) {
		System.out.println("hello guy");
	}

	public void sayHello(Man guy) {
		System.out.println("hello man");
	}

	public void sayHello(Woman guy) {
		System.out.println("hello woman");
	}

}

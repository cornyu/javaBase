package base.pattern;

public class TES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		switch (2) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;

		default:
			System.out.println("default");
			break;
		}
	}

}
abstract class c1{
	public c1(){
		System.out.println("1");
	}
}
class c2 extends c1{
	public c2(){
		System.out.println("2");
	}
}

class c3 extends c2{
	public c3(){
		System.out.println("3");
	}
}
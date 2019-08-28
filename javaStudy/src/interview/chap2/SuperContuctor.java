package interview.chap2;

/**
 * @author cornyu
 * @version 创建时间：2019年7月23日 下午7:26:16 类说明
 */

class Base {
	Base() {
		System.out.println("Base");
	}
	
	Base(String msg){
		System.out.println("Base:"+msg);
	}
}


public class SuperContuctor extends Base {
	
	SuperContuctor(){
		System.out.println("SuperContuctor");
	}
	
	SuperContuctor(String msg){
		super(msg);
		System.out.println("SuperContuctor:"+ msg);
	}
	
	public static void main(String[] args) {
		new SuperContuctor();
		new SuperContuctor("dd");
	}
}

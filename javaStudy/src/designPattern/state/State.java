package designPattern.state;
/**
 * 核心思想就是：当对象的状态改变时，同时改变其行为，很好理解！就拿QQ来说，有几种状态，在线、隐身、忙碌
等，每个状态对应不同的操作，而且你的好友也能看到你的状态，所以，
状态模式就两点：
1、可以通过改变状态来获得不同的行为。
2、你的好友能同时看到你的变化。
 *
 * @author xiaoyu
 *
 */
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void method1(){
		System.out.println("execute the first opt");
	}
	
	
	public void method2(){
		System.out.println("execute the second opt");
	}
}

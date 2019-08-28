package designPattern.state;
/**
 * 状态模式的切换类
 * @author xiaoyu
 *
 */
public class Context {

	private State state;
	
	public Context(State state){
		this.state=state;
	}
	
	public State getState(){
		return state;
	}
	
	public void method(){
		if(state.getValue().equals("state1")){
			state.method1();
		}
		if(state.getValue().equals("state2")){
			state.method2();
		}
	}
	
}

package designPattern.bridge.demo01;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 上午9:58:06 
 * 
 * 遥控器要包含对ITV的引用 
 * 
 */
public abstract class AbstractRemoteControl {
	private ITV tv;
	 
    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }
 
    public void turnOn(){
        tv.on();
    }
 
    public void turnOff(){
        tv.off();
    }
 
    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}

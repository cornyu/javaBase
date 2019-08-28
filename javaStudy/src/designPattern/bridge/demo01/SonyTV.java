package designPattern.bridge.demo01;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 上午9:57:05 
 * 类说明 
 */
public class SonyTV implements ITV {

	@Override
	public void on() {
		System.out.println("SonyTV is turned on.");
	}

	@Override
	public void off() {
		System.out.println("SonyTV is turned on.");
	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("SonyTV is turned on.");
	}

}

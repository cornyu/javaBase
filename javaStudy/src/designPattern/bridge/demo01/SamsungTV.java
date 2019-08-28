package designPattern.bridge.demo01;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 上午9:55:03 
 * 类说明 
 */
public class SamsungTV implements ITV {

	@Override
	public void on() {
		System.out.println("Samsung is turned on.");
	}

	@Override
	public void off() {
		System.out.println("Samsung is turned off.");
	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("Samsung is switchChannel.");
	}

}

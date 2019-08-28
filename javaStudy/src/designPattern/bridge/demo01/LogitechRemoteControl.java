package designPattern.bridge.demo01;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 上午10:00:43 类说明
 */
public class LogitechRemoteControl extends AbstractRemoteControl {

	public LogitechRemoteControl(ITV tv) {
		super(tv);
	}

	public void setChannelKeyboard(int channel) {
		setChannel(channel);
		System.out.println("Logitech use keyword to set channel.");
	}

	//测试
	public static void main(String[] args) {
		 ITV tv = new SonyTV();
	     LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
	     lrc.setChannelKeyboard(100); 
	     
	}

}

package designPattern.factory.abstractfactory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("发送短信");
	}

}

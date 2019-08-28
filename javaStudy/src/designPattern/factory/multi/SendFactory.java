package designPattern.factory.multi;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-9 下午6:40:28 
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class SendFactory {

	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}

}

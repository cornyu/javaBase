package designPattern.factory.ordinary;

/**
 * @author 作者 E-mail:
 * @version 创建时间：2017-7-9 下午6:35:26 类说明
 */
public class SendFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}

}

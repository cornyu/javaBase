package designPattern.factory.multi;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-9 下午6:42:21 
 * 类说明
 */
public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.send();
	}

}

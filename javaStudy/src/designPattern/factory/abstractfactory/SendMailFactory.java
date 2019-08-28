package designPattern.factory.abstractfactory;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-9 下午6:47:23 
 * 类说明 
 */
public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}

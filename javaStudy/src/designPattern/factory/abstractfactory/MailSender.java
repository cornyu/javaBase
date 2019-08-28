package designPattern.factory.abstractfactory;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-9 下午6:43:55 
 * 类说明 
 */
public class MailSender  implements Sender{

	@Override
	public void send() {
		System.out.println("发送邮件");
	}

}

package designPattern.factory.ordinary;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-9 下午6:38:06 
 * 类说明  静态工厂
 */
public class FactoryTest {

	 public static void main(String[] args) {  
	        SendFactory factory = new SendFactory();  
	        Sender sender = factory.produce("sms");  
	        sender.send();  
	   }  

}

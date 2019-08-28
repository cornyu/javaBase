package designPattern.mediator;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:16:42 
 * 
 * 抽象中介者 
 * 
 * 就以租房为例，这里中介机构充当租房者与房屋所有者之间的中介者
 * 
 */
public abstract class Mediator {
	 //申明一个联络方法  
    public abstract void constact(String message,Person person);  

}

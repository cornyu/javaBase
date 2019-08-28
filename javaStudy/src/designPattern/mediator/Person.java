package designPattern.mediator;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:17:23 
 * 抽象同事对象-- 
 */
public abstract class Person {
	protected String name;
	protected Mediator mediator;

	Person(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	
    
    
}

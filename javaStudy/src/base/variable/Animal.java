package base.variable;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-15 下午8:48:55 
 * 变量权限问题
 * public
 * protected
 * 缺省
 * private 
 */
public class Animal {

	public String name;
	protected String age;//其他package 的 子类 里 可以访问
	 String sex;		 //其他package 的 子类 里 不可以访问
	private String id;
	
}

package designPattern.builder;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 下午1:58:55 
 * 泡茶builder 
 */
public class TeaBuilder extends StarbucksBuilder {

	@Override
	public void buildSize() {
		starbucks.setSize("large");
        System.out.println("build large size");
	}

	@Override
	public void buildDrink() {
		starbucks.setDrink("tea");
        System.out.println("build tea");
	}
	
	

}

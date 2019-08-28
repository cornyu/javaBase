package designPattern.builder;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 下午2:01:08 
 * 
 * 咖啡builder
 * 
 */
public class CoffeeBuilder extends StarbucksBuilder {

	@Override
	public void buildSize() {
		starbucks.setSize("medium");
		System.out.println("build medium size");
	}

	@Override
	public void buildDrink() {
		starbucks.setDrink("coffee");
		System.out.println("build coffee");

	}

}

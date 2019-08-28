package designPattern.builder;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 下午2:03:07 
 * 服务员类
 */
public class Waiter {
	
	private StarbucksBuilder starbucksBuilder;

	public void setStarbucksBuilder(StarbucksBuilder builder) {
		starbucksBuilder = builder;
	}

	public Starbucks getstarbucksDrink() {
		return starbucksBuilder.getStarbucks();
	}

	public void constructStarbucks() {
		starbucksBuilder.createStarbucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}
}

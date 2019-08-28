package designPattern.builder;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 下午2:04:14 类说明
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder();

		// 也可以用泡茶builder沏茶
		// StarbucksBuilder teaBuilder = new TeaBuilder();

		waiter.setStarbucksBuilder(coffeeBuilder);
		waiter.constructStarbucks();

		// 取到饮料
		Starbucks drink = waiter.getstarbucksDrink();
	}

}

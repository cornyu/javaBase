package designPattern.proxy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:44:32 类说明
 */
public class TestProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeautifulGirl mm = new BeautifulGirl("小屁孩...");

		HerChum chum = new HerChum(mm);

		chum.giveBook();
		chum.giveChocolate();
		chum.giveFlowers();
	}

}

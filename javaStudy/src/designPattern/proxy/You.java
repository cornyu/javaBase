package designPattern.proxy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:42:22 类说明
 */
public class You {
	BeautifulGirl mm; // 美女

	public You(BeautifulGirl mm) {
		this.mm = mm;
	}

	public void giveBook() {
		System.out.println(mm.getName() + ",送你一本书....");
	}

	public void giveChocolate() {
		System.out.println(mm.getName() + ",送你一盒巧克力....");
	}

	public void giveFlowers() {
		System.out.println(mm.getName() + ",送你一束花....");
	}
}

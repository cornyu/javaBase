package designPattern.proxy;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:41:02
 *          读大学的时候都追过女生吧！某天你看到一位美女，一见钟情，心里发誓要她做你女朋友。但是你想这样直接上去可能会唐突了。
 *          于是你采用迂回政策，先和她室友搞好关系，然后通过她室友给她礼物，然后……
 * 
 *          首先出现的就是美女一枚：BeautifulGirl.java
 */
public class BeautifulGirl {
	String name;

	public BeautifulGirl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

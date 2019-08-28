package designPattern.command;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:54:02 
 * 电视机类
 */
public class Television {
	
	public void open() {
		System.out.println("打开电视机......");
	}

	public void close() {
		System.out.println("关闭电视机......");
	}

	public void changeChannel() {
		System.out.println("切换电视频道......");
	}

}

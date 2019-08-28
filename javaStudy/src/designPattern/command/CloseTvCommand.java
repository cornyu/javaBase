package designPattern.command;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:58:10 类说明
 * 
 * 关电视
 */
public class CloseTvCommand implements Command {
	private Television tv;

	public CloseTvCommand() {
		tv = new Television();
	}

	public void execute() {
		tv.close();
	}
}

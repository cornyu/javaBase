package designPattern.command;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:59:37 
 * 换台
 */
public class ChangeChannelCommand implements Command {
	private Television tv;

	public ChangeChannelCommand() {
		tv = new Television();
	}

	public void execute() {
		tv.changeChannel();
	}
}

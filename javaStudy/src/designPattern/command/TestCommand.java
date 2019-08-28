package designPattern.command;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:01:27 类说明
 */
public class TestCommand {
	public static void main(String[] args) {
		Command openCommand, closeCommand, changeCommand;

		openCommand = new OpenTvCommand();
		closeCommand = new CloseTvCommand();
		changeCommand = new ChangeChannelCommand();

		Controller control = new Controller(openCommand, closeCommand,
				changeCommand);

		control.open(); // 打开电视机
		control.change(); // 换频道
		control.close(); // 关闭电视机
	}

}

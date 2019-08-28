package designPattern.command;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午3:00:16 
 * 控制器 类
 */
public class Controller {
	private Command openTVCommand;
	private Command closeTVCommand;
	private Command changeChannelCommand;

	public Controller(Command openTvCommand, Command closeTvCommand,
			Command changeChannelCommand) {
		this.openTVCommand = openTvCommand;
		this.closeTVCommand = closeTvCommand;
		this.changeChannelCommand = changeChannelCommand;
	}

	/**
	 * 打开电视剧
	 */
	public void open() {
		openTVCommand.execute();
	}

	/**
	 * 关闭电视机
	 */
	public void close() {
		closeTVCommand.execute();
	}

	/**
	 * 换频道
	 */
	public void change() {

		changeChannelCommand.execute();
	}

}

package designPattern.command;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:50:19 
 * 类说明 
 * 
 *  这里以电视机为例。电视机是请求的接受者，遥控器是请求的发送者，遥控器上有一些按钮，不同的按钮对应着不同的操作。
 *  在这里遥控器需要执行三个命令：打开电视机、关闭电视机、换台。
 *  
 */
public interface Command {
    public void execute();  

}

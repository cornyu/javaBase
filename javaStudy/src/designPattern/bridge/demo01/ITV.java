package designPattern.bridge.demo01;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 上午9:54:11 
 * 电视机的接口：ITV 
 * 电视和遥控器是一个完美展示两层抽象的例子。你有一个电视机的接口，还有一个遥控器的抽象类。
 * 我们都知道，将它们中任何一个定义为一个具体类都不是好办法，因为其它厂家会有不同的实现方法。
 * 
 */
public interface ITV {
	public void on();
    public void off();
    public void switchChannel(int channel);
}

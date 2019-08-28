package designPattern.command;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:55:13 
 * 开电视
 */
public class OpenTvCommand implements Command{

	private Television tv;  
    
    public OpenTvCommand(){  
        tv = new Television();  
    }  
    
    @Override
    public void execute() {  
        tv.open();  
    }  


}

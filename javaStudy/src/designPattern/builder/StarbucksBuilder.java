package designPattern.builder;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-10-24 下午1:56:19 
 * 类说明 
 */
public abstract class StarbucksBuilder {
	protected Starbucks starbucks;
	 
    public Starbucks getStarbucks() {
        return starbucks;
    }
 
    public void createStarbucks() {
        starbucks = new Starbucks();
        System.out.println("a drink is created");
    }
 
    public abstract void buildSize();
    public abstract void buildDrink();
    
 
}

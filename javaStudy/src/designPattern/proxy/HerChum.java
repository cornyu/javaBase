package designPattern.proxy;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-14 下午2:42:54 
 * 类说明 
 */
public class HerChum implements GiveGift{

	You you;    
    public HerChum(BeautifulGirl mm){  
        you = new You(mm);  
    }  
    
    
	@Override
	public void giveFlowers() {
		you.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		you.giveChocolate();
	}

	@Override
	public void giveBook() {
		you.giveBook();
	}

}

package base.proxy_sum.performance.test;
/** 
* @author cornyu 
* @version 创建时间：2018年8月27日 下午3:12:07 
* 类说明 
*/
public class CountServiceImpl implements CountService{

	 private int count = 0;   
	    
	@Override
	public int count() {
		return count ++;  
	}

}

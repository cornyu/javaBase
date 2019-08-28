package interview.chap2;

import java.util.HashMap;
import java.util.Map;


/** 
* @author cornyu 
* @version 创建时间：2019年7月23日 下午5:03:57 
* 类说明 
*/
public class ExtendsMethod {

	public static void main(String args[]) {
		Map result = new HashMap();
		result.put(null, "dd");//key不
		result.put("dd", null);
		//result.put(null, null);
		System.out.println(result);
		
	}
}

package test;

import java.util.HashMap;
import java.util.Map;


/** 
* @author cornyu 
* @version 创建时间：2018年4月9日 下午4:16:18 
* 类说明 
*/
public class TestFinally {

	public static void main(String[] args) {
		TestFinally testFinally = new TestFinally();
		HashMap<String, String> map = new HashMap<String, String>();
		Map map2 = testFinally.getName(map);
		System.out.println(map2.get("name"));
	}
	
	public HashMap<String, String> getName(HashMap<String, String> map) {
		try {
			map.put("name", "1");
			return map;
		} finally {
			map.put("name","2");
		}
		
	}

}

package json.gson.demo1;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

/** 
* @author cornyu 
* @version 创建时间：2017年12月29日 上午9:41:56 
* 类说明 
*/
public class GSONTest {

	public static void main(String[] args) {
		Gson gson = new Gson();

		Map input = new HashMap();
		Map body = new HashMap();
		Map head = new HashMap();
		
		head.put("username", "yu");
		head.put("age", "18");
		
		body.put("transId", "cmbc.testfast");
		
		input.put("head", head);
		input.put("body", body);

		//将 head map转为字符串
		String headJson = gson.toJson(input);
		System.out.println("map被转为json字符串："+headJson);
		
		//将 head 字符串转为 map
		Map jsonMap = gson.fromJson(headJson, HashMap.class);
		System.out.println("json格式的字符串被转为map:"+jsonMap);
		System.out.println("gson将字符转为map后的结果类型："+jsonMap.getClass());
		Map headMap = (Map)(jsonMap.get("head"));
		System.out.println(headMap.getClass());
		
		User user = gson.fromJson(head.toString(), User.class);
		System.out.println("gson将字符转为bean对象："+user+" -- "+user.getAge()+" "+user.getUsername());

		
		String inputJson	 = gson.toJson(input);
		System.out.println(inputJson);
		


	}

}

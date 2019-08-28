package json.fastjson.demo1;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import json.gson.demo1.User;

/** 
* @author cornyu 
* @version 创建时间：2017年12月29日 上午11:31:32 
* 类说明 
*/
public class FastJsonTest {

	public static void main(String[] args) {
		Map input = new HashMap();
		Map body = new HashMap();
		Map head = new HashMap();
		
		head.put("username", "yu");
		head.put("age", "18");
		
		body.put("transId", "ff.testfast");
		
		input.put("head", head);
		input.put("body", body);
		
		System.out.println("input map:"+input);
		
		
		input.put("head", new JSONObject(head).toJSONString());
		input.put("body", new JSONObject(body).toJSONString());
		System.out.println("input map:"+input.get("head"));
		
		User user = JSONObject.parseObject((String)(input.get("head")),User.class);
		System.out.println(user.getAge());
		

		
		
		JSONObject headJson = new JSONObject(input);
		System.out.println("input map被转为json字符串："+headJson.toJSONString());
		
		JSONObject jsonObject = JSON.parseObject(headJson.toJSONString());
		System.out.println("json字符串被转为jsonobject:"+jsonObject);
		
		Map resultMap = null;
		resultMap = JSON.parseObject(headJson.toJSONString(), HashMap.class);
		System.out.println("json字符串被转为map:" + resultMap.getClass());
		
		System.out.println("class:"+ resultMap.get("head").getClass());

		System.out.println("jsonObject是否为map:"+(resultMap.get("head") instanceof Map));
	

	}

}

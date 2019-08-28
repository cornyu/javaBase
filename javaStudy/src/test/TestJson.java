package test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * fastjson 测试类
 * @author Administrator
 *
 */
public class TestJson {

	
	public static void main(String[] args) {

		HashMap inputMap = new HashMap();
		
		HashMap bodyMap = new HashMap();
		bodyMap.put("code", "S");
		
		HashMap transMap = new HashMap();
		transMap.put("PDY", "1");
		bodyMap.put("transMap", transMap);
		
		HashMap headMap = new HashMap();
		headMap.put("sso", "1234567");
		
		
		inputMap.put("body", bodyMap);
		inputMap.put("head",headMap);
		
		JSONObject jsonObject = new JSONObject(inputMap);
		System.out.println((jsonObject.toString()));
		
		JSONObject jsonObject2 = JSON.parseObject(jsonObject.toString());
		Map map2 = (Map)jsonObject2;

		System.out.println(map2.get("head"));
		
		Map bodyMap2 = (Map)(map2.get("body"));

		System.out.println(bodyMap2.get("transMap"));

		
	}

}

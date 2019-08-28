package json.fastjson.demo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

/** 
* @author cornyu 
* @version 创建时间：2018年6月30日 上午11:41:47 
* 测试 fastjson 格式化复杂数据类型
*/
public class FastJsonDate {

	public static void main(String[] args) {
		/**入参格式：
		 * input 
		 * 		head
		 * 		
		 */
		HashMap<Object, Object> input = new HashMap<Object, Object>() ;
		Map head = new HashMap();
		head.put("head_cont", "123");
		
		input.put("head",head);
		
		input.put("username", "yu");//string 类型
		input.put("age", 18);//int
		input.put("salary", null);//null

				
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("1");
		list.add("2");
		
		Date date = new Date();
		System.out.println("日期： "+date.toString());
		
		input.put("transId", "ff.test");
		input.put("list", list);//ArrayList
		input.put("date", date);//Date
		
		System.out.println("input map:"+input);
				
		String inputStr = JSON.toJSONString(input);
		System.out.println("JSON 将map转为string后数据：" + inputStr);
				
		Map jsonMap = (Map)JSON.parseObject(inputStr);
		System.out.println("JSON 将string类map转为map："+jsonMap);
		System.out.println("username类型:"+ jsonMap.get("username").getClass());//java.lang.String
		System.out.println("age类型:"+ jsonMap.get("age").getClass());//java.lang.Integer
		System.out.println("list类型:"+ jsonMap.get("list").getClass());//com.alibaba.fastjson.JSONArray
		System.out.println("date类型:"+ jsonMap.get("date").getClass());//java.lang.Long
		System.out.println("head类型:"+ jsonMap.get("head").getClass());//com.alibaba.fastjson.JSONObject

		
		//将string 转为map
		JSONObject jsonObject  = JSON.parseObject(inputStr);
		System.out.println("JSON 将string转为JSONObject后数据：" + jsonObject.toString());
		
		
		
	}

}

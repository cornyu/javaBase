package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/** 
* @author cornyu 
* @version 创建时间：2019年5月27日 下午8:32:21 
* 类说明 
*/
public class TestHashSet {

	public static void main(String[] args) {
		List<String> list = new 	ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("3");
		
		HashSet set = new HashSet(list);
		
		System.out.println("set大小:"+set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
			

	}

}

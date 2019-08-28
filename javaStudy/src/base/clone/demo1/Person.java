package base.clone.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cornyu
 * @version 创建时间：2019年8月10日 下午6:52:10 类说明
 */

public class Person implements Cloneable {

	String name;
	Map attr = new HashMap();

	public Person(String name) {
		this.name = name;
		attr.put("name", name);

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map getAttr() {
		return attr;
	}

	public void setAttr(Map attr) {
		this.attr = attr;
	}
	
	

}
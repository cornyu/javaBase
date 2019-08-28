package base.clone.demo1;

import java.util.HashMap;
import java.util.Map;

/** 
* @author cornyu 
* @version 创建时间：2019年8月10日 下午6:47:28 
* 类说明 
*/
public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1= new Person("yujy");
		Person person2 = (Person) person1.clone();
		
		System.out.println(person1.getName());
		System.out.println(person2.getName());
		
//		当自定义类的字段的类型不是基本数据类型时，上面实现了clone()方法会导致问题，不信看下面的代码：
		person1.getAttr().put("age", 19);
		
		System.out.println(person2.getAttr());//person2 中attr值也跟着person1 改变
		
		
	}

}



package interview.chap1;

import java.beans.VetoableChangeListener;
import java.util.Vector;

/** 
* @author cornyu 
* @version 创建时间：2019年7月15日 上午11:36:26 
* 类说明 
*/
public class BaseTypeConvert {

	public static void main(String[] args) {

		byte a=1,b ;
		int c=3;
		
		//b = a+c; //会报错，因为 a+c 已经是int，然后int赋值给 byte报类型不匹配；
		b = (byte) (a + c);
		System.out.println(b);
		
		Vector<Person> vector = new Vector<>(3);
		
		for(int i=0;i<10;i++) {
			Person person = new Person(i);
			vector.add(person);
			person = null;
		}
		
		System.out.println("vector size:"+vector.size());
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i).getAge());
		}
		
	}
	

}

class Person {
	
	String name;
	int age;
	
	public Person(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

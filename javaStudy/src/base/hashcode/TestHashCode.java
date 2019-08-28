package base.hashcode;
/** 
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-8-1 下午4:00:41 
 * 类说明 
 */
public class TestHashCode {

	
	public static void main(String[] args) {
		Person person1 = new Person("1", "11");
		Person person2 = new Person("1", "11");
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		person2 = person1;
		System.out.println(person2.hashCode());

	}

}

class Person{
	
	public String name;
	public String age;
	
	public Person(String name,String age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}

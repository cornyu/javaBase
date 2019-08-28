package base.object.reference;

public class Person {
  
	public String name;
	public String sex;
	
	public Person(){
		this.name="cornyu";
		this.sex="男";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String toStirng(){
		return "name:"+name+",sex:"+sex;
	}
	
}

package base.object.reference;

public class ObjectRef {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person  person=new Person();
		
		ObjectRef temObjectRef=new ObjectRef();
		temObjectRef.change(person);
		System.out.println(person.toStirng());
	}


	private void change(Person person) {
		person.setName("objecname");
	}

	
}

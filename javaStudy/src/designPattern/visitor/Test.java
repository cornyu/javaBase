package designPattern.visitor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Visitor visitor=new MyVisitor();
		Subject subject=new MySubject();
		subject.accept(visitor);
	}

}

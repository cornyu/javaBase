package designPattern.visitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor visit) {
	visit.visit(this);
	}

	@Override
	public String getSubject() {	
		return "love";
	}

}

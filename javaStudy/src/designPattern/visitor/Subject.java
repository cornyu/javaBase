package designPattern.visitor;

public interface Subject {
	public void accept(Visitor visit);
	public String getSubject();

}

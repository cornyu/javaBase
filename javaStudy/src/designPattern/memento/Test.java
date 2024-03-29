package designPattern.memento;
/**
 * 备忘录模式（Memento）
主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，通俗的讲下：假设
有原始类A，A中有各种属性，A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，类C呢，就是一个
用来存储备忘录的，且只能存储，不能修改等操作。做
 * @author xiaoyu
 *
 */
public class Test {

	//创建原始类
	Original origTest = new Original("egg");
	
	Storage storage = new Storage(origTest.createMemento());
	//origTest.setValue("newEgg");
	//修改原始的类的状态
	

	
}

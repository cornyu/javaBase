package base.proxy;

public class MyAdvice implements Advice {

	@Override
	public void beforeAdvice() {
		System.out.println("前置通知");
	}

	@Override
	public void afterAdvice() {
		System.out.println("后置通知");
	}

}

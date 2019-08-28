package base.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GreetingAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj, Method method, Object[] args,
			Object arg3) throws Throwable {
		System.out.println("After");
			
	}

}

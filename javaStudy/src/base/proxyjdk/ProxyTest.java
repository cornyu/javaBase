package base.proxyjdk;

public class ProxyTest {

	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		MyInvokationHandler myInvokationHandler = new MyInvokationHandler(userService);
		UserService proxy = (UserService) myInvokationHandler.getProxy();
		proxy.add();
	}

}

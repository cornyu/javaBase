/**
 * 
 */
package base.thread.connectionpool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @author cornyu
 *
 */
public class ConnectionDriver {
	
	static class ConnectionHandler implements InvocationHandler{
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if(method.getName().equals("commit")){
				Thread.currentThread().sleep(3000);
			}
			return null;
		}		
	}
	
	public static final Connection createConnection() {
		return (Connection) Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(), 
				new Class<?>[]{Connection.class},
				new ConnectionHandler());
		
	}
}

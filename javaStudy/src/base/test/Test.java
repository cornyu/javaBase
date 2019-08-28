package base.test;

import java.io.InputStream;
import java.lang.management.ManagementFactory;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*InputStream stream=Test.class.getResourceAsStream("/common.xml");
		System.out.println(stream);*/
		String test="[{\"id\":1,\"pId\"]";
		String resultString=test.replaceAll("\"", "'");
		System.out.println(resultString);
		System.out.println(test);
		//[{"id":1,"pId":0,"name":"用户管理","checked":true,"open":true},{"id":2,"pId":0,"name":"系统管理","checked":true,"open":true},{"id":3,"pId":1,"name":"用户管理","checked":true,"open":true},{"id":4,"pId":2,"name":"系统日志","checked":true,"open":true}]
	
	
		List<String> arguments = ManagementFactory.getRuntimeMXBean().getInputArguments();	
		boolean debuging = false;		
		for(String str : arguments) {		
			if(str.startsWith("-agentlib")) {
				debuging = true;			
				}		
			}		
		System.out.println(debuging? "debug mode" : "normal mode");	
		
	}
	
}

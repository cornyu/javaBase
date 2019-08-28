package base.sysytemproperty;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 * @author cornyu E-mail: 25634346995@qq.com
 * @version 创建时间：2017-7-10 下午2:32:09 类说明
 */
public class SystemProperty {

	public static void main(String[] args) {
		System.out.println(System.getenv());
		System.out.println("server_id" + System.getProperty("server_id"));

		System.out.println("user.home:" + System.getProperty("user.home"));

		// 获取当前进程
		RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
		String name = runtime.getName(); // format: "pid@hostname"
		System.out.println(name);
		int PID = Integer.parseInt(name.substring(0, name.indexOf('@')));
		System.out.println(PID);

	}

}

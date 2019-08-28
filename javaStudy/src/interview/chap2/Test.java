package interview.chap2;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author cornyu
 * @version 创建时间：2019年7月23日 下午7:23:55 类说明
 */
public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws UnsupportedEncodingException {
		long a = (int)3.9;//3
		System.out.println(a);
		
		
		String urlStr = URLEncoder.encode("8400201_businessList#20190817150533608", "utf-8");
		System.out.println(urlStr);
		
		String result = URLDecoder.decode(urlStr);
		System.out.println(result);
		
		
	}

}

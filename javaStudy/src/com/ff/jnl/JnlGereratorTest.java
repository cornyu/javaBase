package com.ff.jnl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author cornyu
 * @version 创建时间：2019年6月28日 下午3:15:06 类说明
 */
public class JnlGereratorTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			getJNL();
		}
		
	}

	/**
	 * 生产流水号的一种方式
	 * @return
	 */
	public static String getJNL() {
		SecureRandom secureRandom = null;
		String jnl = null;
		try {
			secureRandom = SecureRandom.getInstance("SHA1PRNG");// 随机算法
			int random = secureRandom.nextInt(8999) + 1000;
			//jnl = "systemcode"+"server_id" + "yyyyMMddHHddssSSS"+4位随机数

			jnl = "310" + "01" + new SimpleDateFormat("yyyyMMddHHddssSSS").format(new Date()) + random;
			System.out.println(jnl);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return jnl;
	}
}

package com.ff.classloader.demo01;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author cornyu
 * @version 创建时间：2018年10月23日 下午7:25:47 类说明
 * 
 *          1，自定义的加载器可以覆盖该方法loadClass()，以便定义不同的加载机制。 例如：
 *          Servlet中的WebappClassLoader覆盖了该方法，在WEB-INFO/classes目录下查找类文件；在加载时，如果成功，
 *          则缓存到ResourceEntry对象。（不同的加载机制）
 */

public class MyClassLoader extends ClassLoader {
	private String rootpath;

	public MyClassLoader(String rootpath) {

		this.rootpath = rootpath;
	}

	/**
	 * findClass()的功能是找到class文件并把字节码加载到内存中。 自定义的ClassLoader一般覆盖这个方法。（以便使用不同的加载路径。）
	 * 在其中调用defineClass()解析字节码。
	 */
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		try {
			byte[] classDate = getDate(name);

			if (classDate == null) {
				System.out.println("not find class ");
			} else {
				// defineClass方法将字节码转化为类
				return defineClass(name, classDate, 0, classDate.length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.findClass(name);
	}

	// 返回类的字节码
	private byte[] getDate(String className) throws IOException {
		InputStream in = null;
		ByteArrayOutputStream out = null;
		String path = rootpath + File.separatorChar + className.replace('.', File.separatorChar) + ".class";
		try {
			in = new FileInputStream(path);
			out = new ByteArrayOutputStream();
			byte[] buffer = new byte[2048];
			int len = 0;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			return out.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
			out.close();
		}
		return null;
	}
}

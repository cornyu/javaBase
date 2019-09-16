package base.xml.sax;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author cornyu
 * @version 创建时间：2019年9月14日 下午11:43:43 类说明
 */
public class SAXParseTest {

	public static void main(String[] args) {

		// ClassLoader

		// SAXParserImpl

		// DocumentBuilderFactoryImpl

		// SAXParserImpl impl = new SAXParserImpl();

		// SAXParser parser = new SAXParser();

//		SAXParser parser = null;
//		try {
//			// 构建SAXParser
//			parser = SAXParserFactory.newInstance().newSAXParser();// com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl@12bc6874
//			// 实例化 DefaultHandler对象
//			SAXHandler handler = new SAXHandler();
//			// 加载资源文件 转化为一个输入流
//			// 通过getResourceAsStream拿到文件的流对象，此文件必须和SAXHandler在同一个目录，否则拿不到文件，输出为null
//			// InputStream in =
//			// SAXParseTest.class.getClassLoader().getResourceAsStream("student.xml");
//			parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("base/xml/sax/student.xml"),
//					handler);
//
//			// 这样也是可以的
//			// InputStream in = new FileInputStream("src/student.xml");
//			// 调用parse()方法
//			// parser.parse(in, handler);
//
//			// 遍历结果
//
//			List<Student> list = handler.getList();
//			for (Student student : list) {
//				System.out.println(student);
//			}
//
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//			System.out.println(e);
//		} catch (SAXException e) {
//			e.printStackTrace();
//			System.out.println(e);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println(e);
//
//		}
		
		for (int i = 0; i < 100; i++) {
			new Worker().start();
			}
		
		
	}

	static class Worker extends Thread {
		@Override
		public void run() {
			while (true) {
				try {

					SAXParser parser = null;
					// 构建SAXParser
					parser = SAXParserFactory.newInstance().newSAXParser();// com.sun.org.apache.xerces.internal.jaxp.SAXParserImpl@12bc6874
					// 实例化 DefaultHandler对象
					SAXHandler handler = new SAXHandler();
//					parser.parse(Thread.currentThread().getContextClassLoader()
//							.getResourceAsStream("base/xml/sax/student.xml"), handler);
					
				} catch (Exception e) {// Do not do this at home, log all
					// exceptions
				}
			}
		}
	}

}

package base.charToStr;

import java.io.UnsupportedEncodingException;


/**
 * 
 * @author Administrator 
 * 2018年4月5日 
 * TODO 字符和字节之间转换
 * 
 * 
 */
public class ByteCharConvert {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "罗长";
		byte[] sb = str.getBytes();
		System.out.println(sb.length);
		for(int i = 0;i<sb.length;i++){
			System.out.println(sb[i]);
		}
		
		System.out.println("-----------------");
		String name = "I am 余";
		char[] nameCh = name.toCharArray();
		System.out.println("name:"+ nameCh.length);
		for(int i = 0;i<nameCh.length;i++){
			System.out.println(nameCh[i]);
		}
		
		System.out.println("编码和解码需要一致---------");
		byte[] utf8 = name.getBytes("ISO-8859-1");
		String nameUTF8 = new String(utf8,"UTF-8");
		//String nameUTF8 = new String(utf8,"ISO-8859-1");

		System.out.println(nameUTF8);//解码失败
		
		System.out.println("name显示---------");
		byte[] nameByteUTF8 = name.getBytes("UTF-8");
		System.out.println(nameByteUTF8.length);
		for(int i = 0;i<nameByteUTF8.length;i++){
			System.out.println(nameByteUTF8[i]);
		}
		
		
	}

}

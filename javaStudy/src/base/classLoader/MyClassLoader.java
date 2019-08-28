package base.classLoader;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.xml.sax.InputSource;

/**
 * 写自己的类加载器
 * 
 * @author xiaoyu
 * 
 * F:\myeclipse10Workspaces\javaStudy\bin\base\classLoader\
 *
 */
public class MyClassLoader extends ClassLoader{

	
	public static void main(String[] args) throws Exception {
	/*String srcPath=	args[0];
	String destDir=args[1];*/
		String srcPath=	"F:\\myeclipse10Workspaces\\javaStudy\\bin\\base\\classLoader\\ClassLoaderAttachment.class";
		String destDir="classLoaderLib";
	
	String destFileName=srcPath.substring(srcPath.lastIndexOf("\\")+1);
	String destPath=destDir+"\\"+destFileName;
	System.out.println("src:"+srcPath);
	System.out.println("dest:"+destPath);
	FileInputStream fis=new FileInputStream(srcPath);
	FileOutputStream fos=new FileOutputStream(destPath);
	
	cypher(fis, fos);
	
	fis.close();
	fos.close();
	
	}

	//即使加密算法 也是解密算法 因为 只是简单的进行了 异或 运算
	public static void cypher(InputStream ips,OutputStream ops) throws IOException{
		int b =-1;
		while((b=ips.read())!=-1){
			ops.write(b^0xff);
		}
	}
	private String classDir;
	public MyClassLoader(){}
	
	public MyClassLoader(String classDir){
		this.classDir=classDir;
	}
	
	
	/* name  class 文件名
	 * @
	 */
	protected Class<?> findClass(String name){
		
		String classFile=classDir+"\\"+name;
		try {
			System.out.println("使用自己的加载器加载："+classFile);
			FileInputStream fis=new FileInputStream(classFile);
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			cypher(fis, bos);
			byte[] bytes=bos.toByteArray();
			return defineClass(bytes, 0, bytes.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
}

package base.file;

import java.io.File;
import java.io.IOException;

public class Realname {
	public static void main(String[] args) throws IOException 
	 {
	 
	  File oldFile = new File("f:/test/PMSTmp.txt");
	  if(!oldFile.exists())
	  {
	   oldFile.createNewFile();
	  }
	  System.out.println("修改前文件名称是："+oldFile.getName());
	  String rootPath = oldFile.getParent();
	  System.out.println("根路径是："+rootPath);
	  File newFile = new File(rootPath + File.separator + "PMS.temp.txt");
	  System.out.println("修改后文件名称是："+newFile.getName());
	  if (oldFile.renameTo(newFile)) 
	  {
	   System.out.println("修改成功!");
	  } 
	  else 
	  {
	   System.out.println("修改失败");
	  }
	 }
	}

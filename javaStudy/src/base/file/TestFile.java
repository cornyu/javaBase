package base.file;

import java.io.File;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  String path="F:/shell";
		  File file=new File(path);
		  File[] tempList = file.listFiles();
		  System.out.println("该目录下对象个数："+tempList.length);
		  for (int i = 0; i < tempList.length; i++) {
		   if (tempList[i].isFile()) {
		    System.out.println("文     件："+tempList[i]);
		   }
		   if (tempList[i].isDirectory()) {
		    System.out.println("文件夹："+tempList[i]);
		   String str= tempList[i].toString();
		   System.out.println("文件夹名："+str);
		   System.out.println(tempList[i].getName());
		   
		   int index=str.lastIndexOf("\\");
		   String subString=str.substring(index+1);
		   System.out.println("文件夹"+subString);
		   
		   }
		  }
	}

}

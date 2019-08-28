package base.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//◆查找html中对应条件字符串
		Pattern pattern = Pattern.compile("href=/'(.+?)/'");
		Matcher matcher = pattern.matcher("<a href=/'index.html/'>主页</a>");
		if(matcher.find())
			System.out.println(matcher.groupCount());
		  System.out.println(matcher.group(1));
	
	
	//截取url
	Pattern pattern2 = Pattern.compile("(http://|https://){1}[//w//.//-/:]+");
	Matcher matcher2 = pattern2.matcher("<http://dsds//gfgffdfd>fdf");
	StringBuffer buffer = new StringBuffer();
	System.out.println(matcher2.find());
	while(matcher2.find()){              
	    buffer.append(matcher.group());        
	    buffer.append("/r/n");              
	System.out.println(buffer.toString());
	
	
	
	}
	
	}
	
}	




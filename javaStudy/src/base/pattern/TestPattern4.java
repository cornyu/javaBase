package base.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern4 {

	public static void main(String args[]){
		/* Pattern pattern = Pattern.compile("^Java.*");
		  Matcher matcher = pattern.matcher("Java不是人");
		  boolean b= matcher.matches();
		  //当条件满足时，将返回true，否则返回false
		  System.out.println(b);
		  System.out.println(matcher.group(0));*/
	/*	Pattern pattern = Pattern.compile("([a-zA-Z]+)\\s+[0-9]{1,2},\\s*[0-9]{4}");
		Matcher matcher = pattern.matcher("June 26, 1951");
		if(matcher.find())
			System.out.println("COUNT:"+matcher.groupCount());
		  System.out.println(matcher.group(0));
		  System.out.println(matcher.group(1));*/
		  
		/*  Pattern pattern2 = Pattern.compile("^<font \\s* >$");
			Matcher matcher2 = pattern2.matcher("<font face='Arial' size='22'>");
			if(matcher2.find()){
				System.out.println("COUNT:"+matcher2.groupCount());
				  System.out.println(matcher2.group(0));
				 System.out.println(matcher2.group(1));
			}*/
			
		
			String regEx = "(.+?).txt$";  
			String s = "c:/test.txt";  
			Pattern pat = Pattern.compile(regEx);  
			Matcher mat = pat.matcher(s);  
			boolean rs = mat.find();  
			System.out.println(rs);
			 System.out.println("ss:"+mat.group(0));
			for(int i=0;i<=mat.groupCount();i++){  
			
			  System.out.println(mat.group(i));
			}   
			
			
			
			Pattern pattern = Pattern.compile("/(.+?)/");
			Matcher matcher = pattern.matcher("<a href=/index.html/>主页</a>");
			if(matcher.find()){
			  System.out.println(matcher.group(1));
			}

		  
	}
	
}

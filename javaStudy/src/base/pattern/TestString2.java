package base.pattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString2 {

			public static final String patternString1="[^\\s]*(	(<\\s*[aA)\\s+(href\\s*=[^>]+\\s*)>) (.* )</[aA)>).*";
			public static final String patternString2=".*{<\\s*[aA)\\s+(href\\s*=[^>] +\\s* )>(.*)</[aA]>}.*";
			public static final String patternString3=".*href\\s*=\\s*(\"|'|)http://.*";
			
			public static Pattern patternl =Pattern.compile(patternString1,Pattern.DOTALL) ;
			public static Pattern pattern2 =Pattern.compile(patternString2 , Pattern .DOTALL);
			public static Pattern pattern3 =Pattern.compile(patternString3,Pattern.DOTALL);
			/**
			* @param args
			*/
			public static void main(String[] args) {
				System.out.println("222");
			
			String ss= "这是测试<a href=http://www.google.cn>www.google.cn</a>真的是测试了";
			
			Set<String> set=new HashSet<String>();
			
			parseUrl(set,ss);
			
			System.out .println(replaceHtml(set,ss));
			
			}
		
			public static String replaceHtml(Set<String> set,String var)
			{
				String result=null ;
				result=var;
			Iterator<String> ite=set.iterator();
			while(ite.hasNext())
			{
				String url =ite.next() ;
				if(url!=null)
				{
				result=result .replaceAll(url,url+" target=\"_blank\"");
				}
			}
			return result;
			}
			
			
			public static void parseUrl(Set<String> set,String var)
			{
			Matcher matcher=null;
			String result=null;
			if(var!=null && var.length()>28)
			{
			matcher=pattern3 . matcher(var);
			
			if(matcher!=null && matcher.matches())
			{
			matcher=patternl . matcher(var);
			String aString=null;
			String bString=null;
			while(matcher!=null && matcher.find())
			{
				if(matcher .groupCount()>3)
				{
				bString=matcher.group(matcher.groupCount()-3);
				aString=matcher.group(matcher.groupCount()-2);
				String url1=matcher.group(matcher.groupCount()-1);
				set.add(url1);
				//去掉找到的URL得html标签
				bString=bString.replaceAll(aString, "");
				}
			}
			if(bString!=null){
				parseUrl(set, bString);
				}
			}
		}
	}
}
			
	
package base.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 匹配 所有< >
		Pattern pattern = Pattern.compile("<.+?>", Pattern.DOTALL);
		Matcher matcher = pattern.matcher(" <a href=\"index . html\">hhe<a>");

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		String string = matcher.replaceAll("");
		System.out.println(string);		

		System.out.println("#################################");
		Pattern pattern2 = Pattern.compile("href=\"( .+ ? )\"");
		Matcher matcher2 = pattern.matcher("<a href=\"index. html\">test</a>");
		while (matcher2.find()) {
			System.out.println(matcher2.group());
		}

		System.out.println("333 获取超链接");
		Pattern pattern3 = Pattern
				.compile("(http://|https://) {1} [\\w\\.\\-/:]+");
		Matcher matcher3 = pattern
				.matcher("dsdsds <http://dsd//gfgffdfd> fdf ");
		StringBuffer buffer = new StringBuffer();
		while (matcher3.find()) {
			buffer.append(matcher3.group());
			buffer.append("\r\n");
			System.out.println(buffer.toString());
			;
		}

	}

}

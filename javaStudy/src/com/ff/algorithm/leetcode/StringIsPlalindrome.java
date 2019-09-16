package com.ff.algorithm.leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author cornyu
 * @version 创建时间：2019年9月14日 下午9:49:21 类说明
 */
public class StringIsPlalindrome {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String cont = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		// System.out.println("ccc:"+cont.substring(1,1));
		// System.out.println(sPlalindrome(cont,0,cont.length() - 1));
		System.out.println(countMaxPalindromeLength(cont));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		// String content = null;
		// Scanner scanner = new Scanner(System.in);
		// content = scanner.next();
		// System.out.println(countMaxPalindromeLength(content));

	}

	static String countMaxPalindromeLength(String s) {
		int maxLength = 0;
		String maxContent = "";
		if (null == s || s.length() == 0) {
			return maxContent;
		}
		HashMap<String, String> dealResult = new HashMap<>();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			for (int j = i; j <= length; j++) {

				String temp = s.substring(i, j);

				if (temp != null && temp.length() > 0) {

					if (null == dealResult.get(temp)) {
						// 未处理
						boolean result = sPlalindrome(temp, 0, temp.length() - 1);
						if (result) {// 如果是
							dealResult.put(temp, "1");
							if (temp.length() > maxLength) {
								// System.out.println("true:"+temp);
								maxLength = temp.length();
								maxContent = temp;
							}
						} else {
							dealResult.put(temp, "0");
						}
					}
				}
			}
		}

		return maxContent;
	}

	public static boolean sPlalindrome(String temp, int i, int j) {
		if (i > j) {
			return false;
		}
		if (i == j) {
			return true;
		}
		if (j - i == 1) {
			char a = temp.charAt(i);
			char b = temp.charAt(j);
			return (a == b);
		}

		return ((temp.charAt(i) == temp.charAt(j)) && sPlalindrome(temp, i + 1, j - 1));
	}

}

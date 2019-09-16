package com.ff.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/** 
* @author cornyu 
* @version 创建时间：2019年9月14日 下午11:25:14 
* 类说明 
* 最长无重复子字符串
*/
public class LengthOfLongestSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }

}

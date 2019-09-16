package com.ff.algorithm.interview;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.core.Link;

/**
 * @author cornyu
 * @version 创建时间：2019年9月2日 下午6:26:28 类说明 LRU:最近最少使用算法
 */
public class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {

	private static final float hashLoadFactory = 0.75f;
	private LinkedHashMap<K, V> map;
	private int cacheSize;

	public static void main(String[] args) {

	}

}

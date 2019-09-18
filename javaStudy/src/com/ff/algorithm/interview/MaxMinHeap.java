package com.ff.algorithm.interview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 
 * @author yu
 *
 * 最大最小堆
 */
public class MaxMinHeap {

	public static void main(String[] args) {

		
		PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(11,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
		});
		
		
		minQueue.add(8);
		minQueue.add(6);
		minQueue.add(7);
		
		for(Iterator<Integer> iterator = minQueue.iterator();iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------------");
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
		});
		
		maxHeap.add(9);
		maxHeap.add(7);
		maxHeap.add(10);

		for(Iterator<Integer> iterator2 = maxHeap.iterator();iterator2.hasNext();) {
			System.out.println(iterator2.next());
		}
		
		
		
	}

}

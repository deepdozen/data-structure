package com.app.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//http://www.java67.com/2015/06/what-is-fail-safe-and-fail-fast-iterator-in-java.html

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		// getting java.util.ConcurrentModificationException
//		for(String s: list) {
//			if(s.equals("a")) {
//				list.remove(1);
//			}
//		}
		
		//avoiding java.util.ConcurrentModificationException
		//using fail-fast iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals("a"))
				iterator.remove();
		}
		System.out.println(list);
		
		
		//concurrent collection use fail-safe iterator 
		//which not raise getting java.util.ConcurrentModificationException
		//using fail-safe iterator
		List<String> concurrentList = new CopyOnWriteArrayList<String>();
		concurrentList.add("a");
		concurrentList.add("b");
		concurrentList.add("c");
		concurrentList.add("d");

		for (String s : concurrentList) {
			if (s.equals("a")) {
				concurrentList.remove(1);
			}
		}
		System.out.println(concurrentList);
	}
	
}

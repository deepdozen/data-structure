package com.app.stack;

import java.util.Iterator;
import java.util.LinkedList;

public class StackImpl2<V> implements Stack<V> {
	
	private LinkedList<V> data = new LinkedList<V>();

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

	public V pop() {
		return data.removeLast();
	}

	public V peek() {
		return data.getLast();
	}

	public void push(V item) {
		data.add(item);
	}

	public Iterator<V> iterator() {
		return data.iterator();
	}

}

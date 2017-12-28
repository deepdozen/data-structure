package com.app.stack;

public interface Stack<V> extends Iterable<V>{

	public int size();
	public boolean isEmpty();
	public V pop();
	public V peek();
	public void push(V item);
	
}

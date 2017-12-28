package com.app.bag;

public interface Bag<V> {

	public int size();
	
	public boolean isEmpty();
	
	public void add(V item);
	
}

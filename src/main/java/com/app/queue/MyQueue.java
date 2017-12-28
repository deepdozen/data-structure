package com.app.queue;

public interface MyQueue<V> extends Iterable<V> {
	
	public int size();
	
	public boolean isEmpty();
	
	//add
	public void enqueue(V item);
	
	//remove
	public Object dequeue();
	
}

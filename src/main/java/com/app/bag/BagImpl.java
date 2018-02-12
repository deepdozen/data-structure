package com.app.bag;

import java.lang.reflect.Array;
import java.util.Iterator;

/*
 * A bag is a collection where removing items is not supported—its purpose is to provide clients 
 * with the ability to collect items and then to iterate through the collected items.
 * https://algs4.cs.princeton.edu/13stacks/
 * 
 */

public class BagImpl<V> implements Bag<V> {
	private V[] data;
	private int size;
	private int capacity;
	private Class<V> clazz;
	
	public BagImpl(Class<V> c) {
		this(c,10);
	}
	
	public BagImpl(Class<V> c, int capacity) {
		this.capacity=capacity;
		this.clazz = c;
		data = (V[]) Array.newInstance(c, capacity);
	}

	public int size() {		
		return size;
	}

	public boolean isEmpty() {		
		return size==0;
	}

	public void add(V item) {
		if(size==data.length) {
			V[] tmp = (V[]) Array.newInstance(clazz, data.length+capacity);//new V[data.length+capacity];
			for(int i=0;i<data.length;i++) {
				tmp[i]=data[i];
			}
			data = tmp;
		}
		data[size]=item;
		size++;
	}

	public Iterator<V> iterator() {
		return new ArrayIterator(data);
	}
	
	private class ArrayIterator implements Iterator<V>{
		private int current;
		private V[] data;
		
		public ArrayIterator(V[] data) {
			this.data = data;
			this.current = 0;
		}

		public boolean hasNext() {
			return (current < data.length);
		}

		public V next() {
			return data[current++];
		}
		
	}

}

package com.app.bag;

import java.lang.reflect.Array;

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

}

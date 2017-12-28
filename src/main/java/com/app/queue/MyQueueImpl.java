package com.app.queue;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyQueueImpl<V> implements MyQueue<V>{
	
	private int capacity;
	private V[] data;
	private int indx;
	Class<V> clazz;
	
	public MyQueueImpl(Class<V> c) {
		this(c,10);
	}

	public MyQueueImpl(Class<V> c, int capacity) {
		this.capacity = capacity;
		this.data = (V[]) Array.newInstance(c, capacity);
		this.clazz = c;
	}

	public int size() {
		return indx;
	}

	public boolean isEmpty() {
		return indx == 0;
	}

	public void enqueue(V item) {
		if(indx >= data.length) {
			V[] tmp = (V[]) Array.newInstance(clazz, data.length + capacity);
			for(int i = 0; i < data.length; i++) {
				tmp[i] = data[i];
			}
			this.data = tmp;
		}
		data[indx] = item;
		indx++;
	}
	
    //1,2,3,4,5,6,7
	//2,2,3,4,5,6,7
	//2,3,3,4,5,6,7
	//2,3,4,5,6,7,7
	//2,3,4,5,6,7,null
	public Object dequeue() {
		if(isEmpty()) throw new RuntimeException(); 
		Object value = data[0];
		for(int i = 0; i < data.length-1; i++) {
			data[i] = data[i+1];
		}
		data[size()] = null;
		indx--;
		return value;
	}

	public Iterator<V> iterator() {
		return new Iterator<V>() {
			private int iteratorSize = indx;
			private int itertaorIndex;
			
			public boolean hasNext() {				
				return itertaorIndex<iteratorSize;
			}

			public V next() {
			    V value = data[itertaorIndex];
			    itertaorIndex++;
				return value;
			}
			
		};
	}

}


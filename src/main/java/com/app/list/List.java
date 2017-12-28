package com.app.list;

public interface List<V> extends Iterable<V>{
	public boolean isEmpty();
	public int size();
	public void add(V item);
	public V get(int index);
	public V set(int index, V value);
	public V remove(int index);
}

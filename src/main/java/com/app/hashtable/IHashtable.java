package com.app.hashtable;

public interface IHashtable<K,V> {
	
	public void put(K key, V value); 
	public V get(K key);
	public int size();
	public boolean isEmpty();
	public V remove(K key);
	
}

package com.app.sort;

public class BubbleSort<V extends Comparable<V>> implements Sort<V> {
	
	private V[] a;
	
	public BubbleSort(V[] array) {
		this.a = array;
	}

	public void sort() {
		for(int i = 1; i < a.length ; i++) {
			for(int j = 1; j < a.length ; j++) {
				int cmp = a[j-1].compareTo(a[j]);
				if(cmp>0) {
					V tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
	}

}

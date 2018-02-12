package com.app.sort;

/**
 * 	1. find min of entire list
 *  2. exchange min with first element
 *  3. find min of tail
 *  
 * 	64 25 12 22 11
 *	11 64 25 12 22
 *	11 12 64 25 22
 *	11 12 22 64 25
 *	11 12 22 25 64
 * 
 */

public class SelectionSort<V extends Comparable<V>> implements Sort<V> {
	
	private V[] a;
	
	public SelectionSort(V[] array) {
		this.a = array;
	}

	public void sort() {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				int cmp = a[min].compareTo(a[j]);
				if (cmp > 0) {
					min = j;
				}
			}
			V tmp = a[i];
			a[i] = a[min];
			a[min] = tmp;
		}
	}

}

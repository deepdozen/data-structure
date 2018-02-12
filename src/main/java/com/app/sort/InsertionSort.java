package com.app.sort;

public class InsertionSort<V extends Comparable<V>> implements Sort<V> {

	private V[] a;
	
	public InsertionSort(V[] a) {
		this.a = a;
	}

	public void sort() {
		for (int i = 1; i < a.length; i++) {
			V tmp = a[i];
			int j = i;
			//cmp should be initialize before while loop and updated inside loop
			int cmp = a[j - 1].compareTo(tmp);
			while (j > 0 && cmp > 0) {
				a[j] = a[j - 1];
				j--;
				if (j > 0)
					cmp = a[j - 1].compareTo(tmp);
			}
			a[j] = tmp;
		}
	}

}

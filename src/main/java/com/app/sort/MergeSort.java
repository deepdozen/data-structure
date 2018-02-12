package com.app.sort;

import java.lang.reflect.Array;

public class MergeSort<V extends Comparable<V>> implements Sort<V> {

	private V[] a;
	private Class<V> clazz;
	
	public MergeSort(V[] a, Class<V> c) {
		this.a = a;
		this.clazz = c;
	}
	
	private void merge(V[] left, V[] right, V[] a) {
		int nL = left.length;
		int nR = right.length;
		int i = 0; int j = 0; int k = 0;
		while(i < nL && j < nR){
			if(left[i].compareTo(right[j]) <= 0) {
				a[k] = left[i];
				i++;
			}else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < nL) {
			a[k] = left[i];
			k++;
			i++;
		}
		while(j < nR && k <= j) {
			a[k] = left[j];
			k++;
			j++;
		}
	}

	@SuppressWarnings("unchecked")
	public void sort(V[] a) {
		int n = a.length;
		if (n < 2) return;
		int mid = n / 2;
		
		V[] left = (V[])Array.newInstance(clazz, mid);
		V[] right = (V[])Array.newInstance(clazz, n-mid);
		
		for(int i = 0; i < mid; i++)
			left[i] = a[i];
		for(int i = mid; i < n; i++)
			right[i-mid] = a[i];
		
		sort(left);
		sort(right);
		merge(left, right, a);
	}

	public void sort() {
		sort(a);
	}

}

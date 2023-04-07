package com.neha.gfg.array.school;

import java.util.Arrays;

/**
 * Given an array of N distinct elements,
 * the task is to find all elements in array except two greatest elements in sorted order.
 *
 */
public class AtLeastTwoGreaterElements {
	public static long[] findElements( long a[], long n)
    {
		long[] array = new long[a.length-2];
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length-2;i++) {
			array[i] = a[i];
		}
		
		return array;
		
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long[] a = {2, 8, 7, 1, 5};
        long n=a.length;
    long[] array= findElements(a, n);
    
    for(int i=0; i<array.length; i++) {
    	System.out.print(array[i]+ " ");
    }

	}
 }


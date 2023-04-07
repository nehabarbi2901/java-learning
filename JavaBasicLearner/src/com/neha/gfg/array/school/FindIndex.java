package com.neha.gfg.array.school;

/**
 * Given an unsorted array Arr[] of N integers and a Key which is present in
 * this array. You need to write a program to find the start index ( index where
 * the element is first found from left in the array ) and end index( index
 * where the element is first found from right in the array ). If the key does
 * not exist in the array then return -1 for both start and end index in this
 * case.
 *
 */
public class FindIndex {

	public static int[] findIndex(int a[], int n, int key) {

		int start = -1;	
		int[] result = new int[2];
		  
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                start = i;
                result[0] = start;
                break;
            }
        }
  
        if (start == -1) {
           // System.out.println("Key not present in array");
        	result[0] = start;
        	result[1]=start;
            return result;
        }
  
        int end = start;
        for (int i = n - 1; i >= start; i--) {
            if (a[i] == key) {
                end = i;
                result[1]= end;
                break;
            }
        }
		/*
		 * if (start == end) System.out.println("Only one key is present at index : " +
		 * start); else { System.out.print(start+" "); System.out.print( end); }
		 */
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 5,3, 4, 5, 5 };
		int n = a.length;
		int key = 5;
		int[] findIndex = findIndex(a, n, key);
		
		for(int i=0; i<findIndex.length; i++) {
			System.out.print(findIndex[i]+ " ");
		}

	}

}

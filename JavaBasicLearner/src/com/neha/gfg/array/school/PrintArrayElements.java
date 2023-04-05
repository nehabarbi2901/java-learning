package com.neha.gfg.array.school;
/**
 * Given an array Arr of size N, print all its elements.
 *
 */
public class PrintArrayElements {
   public static void printArray(int arr[], int n) {
        for(int i=0 ; i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	   
	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[]arr= {1,2,3,4,5};
       int n =arr.length;
       printArray(arr, n);
	}

}

package com.neha.gfg.array.school;
/**
 * Given an sorted array A of size N. 
 * Find number of elements which are less than or equal to given element X.
 *
 */
public class CountofArrayElements {  
	public static long countOfElements(long arr[], long n, long x){
     long counter =0;
     for(int i=0;i<n;i++) {
    	 if(arr[i]<=x) {
    		   counter++;
    		   }
		
     }	
     return counter;
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long[]arr= {1, 2, 4, 5, 8, 10};
		long[]arr= {1, 2, 2, 2, 5, 7, 9};
		long n =arr.length;
		long x= 2;
		long countOfElements=countOfElements(arr, n, x);
		System.out.println(countOfElements);
	}

}

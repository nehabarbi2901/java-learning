package com.neha.gfg.array.school;

import java.util.Arrays;

/**
 * Given a sorted array Arr of size N and a value X,
 *  find the number of array elements less than or equal to X
 *   and elements more than or equal to X. 
 *
 */
public class SmallerAndLargerArray {
   public static int[] getMoreAndLess(int[] arr, int n, int x) {
	 int[] array= new int[2];
	 		Arrays.sort(arr);
	 		int count=0, count1=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<=x) {
				count++;
				array[0]=count;
				
			}
			if(arr[i]>=x){
				count1++;
				array[1]=count1;
			}
			
		}
		
		return array;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1, 2, 8, 10, 11, 12, 19};
		int n=arr.length;
		int x=0;
    int[] array=getMoreAndLess(arr, n, x);
    System.out.print(array[0]+" ");
    System.out.println(array[1]+" ");
		
    }
}

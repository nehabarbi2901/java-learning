package com.neha.gfg.array.school;
/*You are given an array A of size N.
 *  You need to print elements of A in alternate order (starting from index 0).
 * 
 */

public class PrintAlertanteNoOfArrays {
	  public static void print(int arr[], int n)
	    {
	         for(int i =0; i<arr.length; i++) {
	  		   if(i%2==0){
	  		         System.out.print(" "+arr[i]);
	  		   }
	  	   }
	    }
	  public static void print1(int arr[], int n)
	    {
	     	       for(int i=0; i<n; i = i+2){
	        
	         System.out.print(" "+arr[i]);
	       }
	     
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4,5,6,7,8,9,10};	
		int n =4;
		print(arr, n);
		print1(arr, n);
		
	}

}

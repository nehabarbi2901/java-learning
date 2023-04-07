package com.neha.gfg.array.school;
/**
 * For a given array of price of items,
 * you have to calculate the average of all prices upto 2 decimal places.

 */

public class AverageOfArray {
   public static String average(int A[], int N)
    {
        N= A.length;
        int sum=0;
        for(int i=0;i<N;i++) {
        	sum+=A[i];
        }
       float av =sum/N;
       
       String s =String.format( "%.2f",av);
      return s;

    }
    public static void main(String[]args) {
    	int A[]= {1, 2, 3, 4, 5};
    	int N= A.length;
     String	average =average(A, N);
     
     System.out.println(average);
    }
    
    
}

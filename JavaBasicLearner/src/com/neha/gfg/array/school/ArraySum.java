package com.neha.gfg.array.school;

public class ArraySum {
    public static long getSum(long a[], long n)
    {
       long sum=0;
        // Your cod int sum =0;
  	   for(int i =0; i<a.length; i++) {
  		   sum= sum+ a[i];
  	   }
  	   return sum;

    }
    public static void main(String args[] ){
    	long[]a = {1,2,3,4};
    	long n=a.length;
    long getSum= getSum(a, n);
    System.out.println(getSum);
}
}

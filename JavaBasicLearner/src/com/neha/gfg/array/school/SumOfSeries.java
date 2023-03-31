package com.neha.gfg.array.school;

public class SumOfSeries {
       public static long sumofnos(int n){
    	   long sum =0;
           sum=(n*(n+1))/2;
    	    return sum;
       }
       public static long sumofnos2(int n) {
    	  long sum =0;
    	   for(int i =0; i<=n; i++) {
    		   sum+=i;
    	   }
    	   return sum;
       }
	public static long sumofnos3(int n) {
	        // code here
	         long sum=0;
	       long m=n;
	         sum=((m+1)*m)/2;
	    	   return sum;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sumofnos = sumofnos(4);
		System.out.println(sumofnos);
		long sumofnos1 =sumofnos(678);
		System.out.println(sumofnos1);
		long sumofnos2 =sumofnos(5778);
		System.out.println(sumofnos2);
	}

}

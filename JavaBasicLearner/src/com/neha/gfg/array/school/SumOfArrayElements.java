package com.neha.gfg.array.school;

/*Given an integer array arr of size n, you need to sum the elements of arr.
 * 
 */
public class SumOfArrayElements {

	 public static int sumElement(int[]arr, int n){
		 int sum =0;
  	   for(int i =0; i<arr.length; i++) {
  		   sum=sum + arr[i];
  	   }
  	   return sum;
  	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1};
		int n =3;
		
		int sumElement = sumElement(arr, n);
		System.out.println(sumElement);
   
	}

}

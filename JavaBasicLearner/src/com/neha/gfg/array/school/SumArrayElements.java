package com.neha.gfg.array.school;

public class SumArrayElements {

	 public static int sum(int arr[], int n) {
	        int sum1=0;
	        
	        for(int i=0;i<arr.length;i++){
	            sum1= sum1+arr[i];
	        }
	        return sum1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,3,1};
      int n = arr.length;
     int sum = sum(arr, n);
     
     System.out.println(sum);
   
	}

}

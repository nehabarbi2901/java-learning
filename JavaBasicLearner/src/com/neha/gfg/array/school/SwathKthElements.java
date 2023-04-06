package com.neha.gfg.array.school;

public class SwathKthElements {
	
   public static void swapKth(int arr[], int n, int k) {
       
    int temp =arr[k-1];
       arr[k-1]= arr[n-k];
       arr[n-k]=temp;
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
    }
	public static void main(String[] args) {
	int[] arr= {1, 2, 3, 4, 5, 6, 7, 8};
       int n=arr.length;
       int k=3;
       swapKth(arr, n, k);
   System.out.println();
	}

}

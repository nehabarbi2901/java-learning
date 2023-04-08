package com.neha.gfg.array.school;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AverageOfStream {
	public static class Solution {
		public static float[] streamAvg(int[] arr, int n) {
		        // code here
             float[] array= new float[arr.length];
		        n= arr.length;
		        float sum=0;
		        DecimalFormat df =new DecimalFormat("#.000");
		   
		        for(int i=0;i<n;i++) {
		        	sum+=arr[i];
		    
		        	float av= sum/(i+1);
		           array[i]=av;      
		     
		 }
		    return array;
		      
		       
  }
		    public static void main(String[]args) {
		    	int[]arr= {10, 20, 30, 40, 50};
		    	int n= arr.length;
		    float[] array=streamAvg(arr, n);
		   for(int i=0;i<array.length;i++) {
			   System.out.print(array[i]+" ");
		   }
		    }
		    
		    
	}	    
}

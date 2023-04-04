package com.neha.gfg.array.school;

import java.util.ArrayList;
/**
 * Given an array Arr of N positive integers.
 * Your task is to find the elements whose value is equal to that of its index value 
 * ( Consider 1-based indexing ).
 * @author admin
 *
 */  



public class ValueEqualToIndexValue {
   public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n){
    ArrayList<Integer> list = new ArrayList<>();
        int i;
        int j;
        for (i = 0; i < n; i++) {
        	j=i+1;
            if (arr[i] == j) {
            	list.add(arr[i]);
            }
            
            
        }
        return list;
	}
    public static void main(String args[])
    {
        int arr[] = { 15,2,45,12,7};
        int n = arr.length;
        //sSystem.out.println(arr);
        ArrayList<Integer> valueEqualToIndex = valueEqualToIndex(arr, n);      
        System.out.println(valueEqualToIndex);
    }

  }

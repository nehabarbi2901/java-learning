package com.neha.gfg.array.school;
/**
 * Given an array of size N and you have to tell whether the array is perfect or not.
 *  An array is said to be perfect if its reverse array matches the original array. 
 *  If the array is perfect then return True else return False.
 */
public class PerfectArrays {
    public static boolean IsPerfect(int a[], int n)
    {int start =0;
    int end =0;
        for(int i=0 ;i<a.length;i++) {
        	 start =a[i];
        	end =a[a.length-1-i];
        
        	if(start!=end) {
        		return false;
        	}
        	
        }
		return true;	
    }
	
	public static void main(String args[]) {
		int [] a= {1, 2, 3, 2, 1};
		int n =a.length;
	boolean IsPerfect=	IsPerfect(a, n);
	if(IsPerfect==true) {
		System.out.println("PERFECT");
	}
	else {
		System.out.println("NOT PERFECT");
	}
	}

}

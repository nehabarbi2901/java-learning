package com.neha.gfg.string.school;

public class LongestNames {
	public static String longest(String names[], int n) {
	        int index=0;
	        String e =names[0];
	        for(int i=1;i<n;i++){
	            String e1=names[i];
	            if(e1.length()>e.length()){
	                index=i;
	                e=e1;
	            }
	            
	        }
	        return e;
	    }
	 public static void main(String[]args) {
	String names[]= {"Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGeeks"  };
	 int n=names.length;
	String longest =longest(names, n);
	System.out.println(longest);
	 }
}

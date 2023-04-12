package com.neha.gfg.string.school;


public class ConvertStringToLowercase { 
	public static String toLower(String S) {
		
		S=S.toLowerCase();
		return S;
   
   
	}
              
	public static void main(String[]args) {
		String S ="ABCddE";
		System.out.println(toLower(S));
	}
}

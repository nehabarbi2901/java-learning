package com.neha.gfg.string.school;
/**
 * Given two strings S1 and S2 as input.
 * Your task is to concatenate two strings and then reverse the string. 
 * Finally print the reversed string.
 *
 */
public class JavaStringSet1 {
    static String conRevstr(String S1, String S2) {
        String rev =S1+S2;
        String rstr ="";
        char ch;
        for(int i=0;i<rev.length();i++) {
        	ch=rev.charAt(i);
        	rstr=ch+rstr;
        }
		return rstr;
    	
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="Geeks" , S2 = "forGeeks";
		conRevstr(S1, S2);
		System.out.println(conRevstr(S1,S2));

	}

}

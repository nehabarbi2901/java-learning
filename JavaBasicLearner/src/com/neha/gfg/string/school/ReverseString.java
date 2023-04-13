package com.neha.gfg.string.school;
/**
 * Given a String S , print the reverse of the string as output.
 *
 */
public class ReverseString {
	public static String revStr(String S) {
		String rstr ="";
		char ch;
		for(int i=0;i<S.length();i++) {
			ch = S.charAt(i);
			rstr=ch+rstr;
			
		}
		return rstr;
        // code here
    } 
	public static void main(String[]args) {
		String S ="GeeksforGeeks";
 		revStr(S);
     System.out.println(revStr(S));
	}

}

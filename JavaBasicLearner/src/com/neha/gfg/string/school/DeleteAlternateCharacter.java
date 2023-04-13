package com.neha.gfg.string.school;
/**
 * Given a string S as input. Delete the characters at odd indices of the string.
 *
 */
public class DeleteAlternateCharacter {
	public static String delAlternate(String S) {
       char[] CharArr= S.toCharArray();
       
       String result= "";
       
       for(int i=0;i<CharArr.length;i++) {
    	   if(i%2==0) {
    		   result =result+ String.valueOf(CharArr[i]);
    	   }
    	   }
	return result;
		
    }
	
	public static void main(String[] args) {
	String S="Neha";
	System.out.println(delAlternate(S));

	}

}

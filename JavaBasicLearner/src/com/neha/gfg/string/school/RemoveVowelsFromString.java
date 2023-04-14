package com.neha.gfg.string.school;
/**
 * Given a string, remove the vowels from the string.
 *
 */
public class RemoveVowelsFromString {
	private static boolean isVowels(char c) {
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			return true;
		}
		return false;
	}
	
  public static String removeVowels(String S) {
       char[] CharArr = S.toCharArray();

       String str="" ;
       
       for(int i =0;i<CharArr.length;i++) {
    	   if(!isVowels(CharArr[i])) {
       str = str+CharArr[i];
   
    	   }
       }
	return str;
    	
    	
    }
  //another way
  
  public static String removevowels1(String S) {
  StringBuilder str= new StringBuilder();
  S= S.toLowerCase();
  for(int i=0; i<S.length(); i++){
      if(S.charAt(i)=='a' || S.charAt(i)=='e'||S.charAt(i)=='i' ||S.charAt(i)=='o' ||S.charAt(i)=='u'){
          continue;
      }
      else
      str.append(S.charAt(i));
  }
  return str.toString();
  
  }
    
    public static void main(String[]args) {
    	String S="welcome to geeksforgeeks";
    	System.out.println(removeVowels(S));
    	System.out.println(removevowels1(S));
    	
    }

}

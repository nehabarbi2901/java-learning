package com.neha.gfg.string.school;

public class ReversingTheVowels {
	private static boolean isVowel(char c) {
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			
			return true;
			}
		return false;
		}
	
  public static String modify (String s)
    {
	int  start =0;
	int end =s.length()-1;
	char[] CharArr = s.toCharArray();
	
	while(start<end) {
		if(!isVowel( CharArr[start])) {
			start++;
			continue;
		}
		if(!isVowel( CharArr[end])) {
			end--;
			continue;
		}
		char c = CharArr[start];
		CharArr[start]=CharArr[end];
		CharArr[end]=c;
		
		start++;
		end--;
		
	}
	
	return String.valueOf(CharArr);
    }
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s ="Practice";
      System.out.println(ReversingTheVowels.modify(s));
		
		
	}

}

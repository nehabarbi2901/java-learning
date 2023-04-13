package com.neha.gfg.string.school;
/**
 * Given a string str,
 *convert the first letter of each word in the string to uppercase. 
 *
 */
public class UperCaseConversion {
	public static String transform(String s)
    {
		String words[]=s.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  

		
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="i love programming";
    System.out.println(transform(s));
    }

}

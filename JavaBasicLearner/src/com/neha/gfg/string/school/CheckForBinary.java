package com.neha.gfg.string.school;
/**
 * Given a non-empty sequence of characters str,
 *  return true if sequence is Binary, else return false
 *
 */
public class CheckForBinary {
	public static boolean isBinary(String str)
	{
	  char[] charArray = str.toCharArray();
		String string = charArray.toString();
		
		    for(int i=0;i<charArray.length;i++) {
		    	
		    	if(charArray[i]<'0' || charArray[i]>='2') {
		    		return false;
		    	}
		    	
		    }
			return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String str="101";
	   boolean isBinary=isBinary(str);
	   if(isBinary==true) {
		   System.out.println("1");
		   
	   }
	   else {
		System.out.println("0");
	}
   }
}

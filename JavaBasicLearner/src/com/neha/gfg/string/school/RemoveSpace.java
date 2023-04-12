package com.neha.gfg.string.school;

public class RemoveSpace {

	public static String modify(String S)
    {
     
		 S = S.replaceAll("\\s","");
	        return S;
    }
		
		public static void main(String[] args) {

	        String S = "g eeks for ge eeks ";
	        System.out.println(modify(S));
		}

}

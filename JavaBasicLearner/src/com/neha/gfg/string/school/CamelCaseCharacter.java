package com.neha.gfg.string.school;
/**
 * Given a string. Count the number of Camel Case characters in it.
 *
 */
public class CamelCaseCharacter {
	public static int countCamelCase (String s)
    {     
	     int count =0;
		char[] charArr = s.toCharArray();
		for(int i=0;i<charArr.length;i++)
		{
			if(charArr[i]>=65 && charArr[i]<=91){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	
		String s = "ckjkUUYII";
		System.out.println(countCamelCase(s));

	}

}

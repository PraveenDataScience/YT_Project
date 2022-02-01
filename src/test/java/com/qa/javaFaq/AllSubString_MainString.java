package com.qa.javaFaq;

public class AllSubString_MainString {

	public static void main(String[] args) {
		String s="VDS";
		allSubString(s);	

	}
	
	public static void allSubString(String s)
	{
		System.out.println("All substring are: ");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.subSequence(i,j));
			}
		}
	}
	



}

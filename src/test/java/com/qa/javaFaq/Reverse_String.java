package com.qa.javaFaq;

public class Reverse_String {

	public static void main(String[] args) {
		String s="VDS TECH LABS";
		System.out.println("Rev String is: "+revString(s));
		revString2("Praveen");

	}
	public static String revString(String s)
	{
		int l=s.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	public static void revString2(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		System.out.println("Rev by SB: "+sb.reverse());
	}

}

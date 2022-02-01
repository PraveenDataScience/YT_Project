package com.qa.javaFaq;

public class LE_FI {
	@FunctionalInterface
	interface FI
	{
		public void m1();
	
	}

	public static void main(String[] args) {
		FI i=()->
		System.out.println("Welcome to VDS TECH LABS");
		i.m1();

	}

}

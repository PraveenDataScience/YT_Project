package com.qa.javaFaq;

import java.util.Scanner;

public class Take_Input_From_User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User name: ");
		String name=sc.nextLine();
		System.out.println("User name is: "+name);

	}

}

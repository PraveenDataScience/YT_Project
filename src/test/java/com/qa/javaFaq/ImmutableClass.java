package com.qa.javaFaq;

final class Test {
	final int i;

	public int getI() {
		return i;
	}

	public Test(int i) {
		this.i = i;
	}

}

public class ImmutableClass {

	public static void main(String[] args) {
		Test t=new Test(10);
		System.out.println(t.getI());

	}

}

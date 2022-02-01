package com.qa.javaFaq;

final public class ImmutableClass1 {
	
	final private int i;
	public ImmutableClass1(int i)
	{
		this.i=i;
	}
	
	public ImmutableClass1 changeValue(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new ImmutableClass1(i);
		}
	}

	public static void main(String[] args) {
		ImmutableClass1 ic=new ImmutableClass1(101);
		ImmutableClass1 ic1=ic.changeValue(1010);
		ImmutableClass1 ic2=ic.changeValue(101);
		System.out.println(ic==ic1);
		System.out.println(ic==ic2);

	}
	
	

}

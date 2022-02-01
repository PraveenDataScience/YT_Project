package com.qa.javaFaq;

public class Jagged_Array {

	public static void main(String[] args) {
		int a[][]={{10,20},{11,12,13},{44},{41,45,47}};
		
		// Length of Array:
		int l=a.length;
		System.out.println("Length of Array: "+l);
		
		//Print the Element:
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}

package com.hdfc.carloan;

public class TwoDimentionArray {

	public static void main(String[] args) {
		int a[][]= {
					{1,2,3,4},
				    {5,6,7},
					{8,9,10,11,12}
					};
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int b[]:a) // {1,2,3,4}{5,6,7}{8,9,10,11,12}
		{
		for(int a1:b)
		{
			System.out.print(a1+"\t");
		}
		System.out.println();
		}
		}

	}


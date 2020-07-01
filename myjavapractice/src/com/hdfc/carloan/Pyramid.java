package com.hdfc.carloan;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter no of column ");
		int column=sc.nextInt();
		for(int i=1;i<column;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
			System.out.print(" *");
			}
			System.out.println();
		}
		

	}

}

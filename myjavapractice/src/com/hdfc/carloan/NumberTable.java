package com.hdfc.carloan;

import java.util.Scanner;

public class NumberTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//System.out.println("Please enter the number for which you want to see the table");
	//int n=s.nextInt();
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{
		System.out.println(i+"*"+j+"="+i*j+"\t");
		}
	}

	}

}

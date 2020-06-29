package com.hdfc.carloan;

import java.util.Scanner;

public class SingleDimentionArrayDemo {
	

	public static void main(String[] args) {
//		int[] a= {10,20,30,40};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("a["+i+"]="+ a[i]);
//		}
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=10;
//		a[2]=10;
//		a[3]=10;
//		a[4]=10;
//		for(int i=0;i<a.length;i++)
//			{
//				System.out.println("a["+i+"]="+ a[i]);
//			}
		int sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Please enter the value: ");
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+ a[i]);
			sum=sum+a[i];
	
		}
		System.out.println("The sum of all array element is : "+sum);
		
	}

}

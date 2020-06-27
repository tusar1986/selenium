package com.hdfc.carloan;

public class MethodOverloading {

	public void disp(int x) {
		System.out.println(x);
	}

	public void disp(float f) {
		System.out.println(f);
	}

	public void disp(Number n) {
		System.out.println(n);
	}
	
	public void disp(Object o)
	{
		System.out.println(o);
	}
	
	public void disp(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		MethodOverloading m=new MethodOverloading();
		m.disp(100);
		m.disp(123.3f);
		m.disp("Tusar");

	}

}

package com.hdfc.carloan;

public class ChildSettersAndGetter {

	public static void main(String[] args) {
		GettersAndSettersDemo g=new GettersAndSettersDemo();
		g.setAddress("Balasore");
		g.getAddress();
		System.out.println("Employee Address is :"+g.getAddress());
		g.setEmpno(12345);
        System.out.println("Employee ID is :"+g.getEmpno());
        g.setEname("Tusar");
        System.out.println("Employee Name is :"+g.getEname());
	}

}

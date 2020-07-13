package com.hdfc.carloan;

public class ChildSettersAndGetter1 extends GettersAndSettersDemo{

	public static void main(String[] args) {
		GettersAndSettersDemo c=new ChildSettersAndGetter1();
		c.setAddress("Bhadrak");
		System.out.println("Employee Address is :"+c.getAddress());
		c.setEmpno(12346);
        System.out.println("Employee ID is :"+c.getEmpno());
        c.setEname("Tusar");
        System.out.println("Employee name is :"+c.getEname());

	}

}

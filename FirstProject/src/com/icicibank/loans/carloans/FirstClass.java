package com.icicibank.loans.carloans;

public class FirstClass implements FirstInterface {
	int i=10;
	float f=12.00f;
	
	public void m1()
	{
		System.out.println("Hi, iam m1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the interactive session");
		FirstClass fc=new FirstClass();
		System.out.println(fc.i);
		System.out.println(fc.f);
		fc.m1();
		fc.m2();
		
		FirstClass fd=new FirstClass();
		System.out.println(fd.i);
		System.out.println(fd.f);
		fd.m1();
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Hi, Iam implemented m2 method in FirstClass");
	}

}

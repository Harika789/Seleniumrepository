package com.icicibank.loans.carloans;

public class ImpAbsclass extends AbsClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpAbsclass ia=new ImpAbsclass();
		ia.m3();
		ia.m4();
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Hi, iam implemented abstract method from abstract class");
	}

}

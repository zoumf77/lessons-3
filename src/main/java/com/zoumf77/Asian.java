package com.zoumf77;

public class Asian extends Race {
	public static void testClassMethod(){
		System.out.println("I live in asia-static in Asian");
	}

	public void testInstanceMethod(){
		System.out.println("I live in asia-instance in Asian");
	}

	
	public static void main(String[] args){
		Asian zmf=new Asian();
		Race may=zmf;
		Race.testClassMethod();
		may.testClassMethod();
		
		zmf.testClassMethod();
		zmf.testInstanceMethod();
		may.testInstanceMethod();
		
	}
}

package com.zoumf77.inheritdemo;


public class Animal {

	public String name="tiger";
	
	public static String area="asia";
	
	public final boolean alive=true;
	
	public Animal(){
		
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public void eat() {
		System.out.println("eat something");
	}
	
	public void run(){
		System.out.println("running");
	}
	
	public static void sleep(){
		System.out.println("sleeping");
	}

}

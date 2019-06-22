package com.zoumf77.inheritdemo;



public class Horse extends Animal{
	
	public static String area="west of asia";
	/*
	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
    */
	
	public boolean alive=false;
	public void eat(){
		System.out.println("eat grass");
	}
	
	
	public static void sleep(){
		System.out.println("horse sleep standing up.");
	}
	
	public static void main(String[] args){
		
		Horse horse=new Horse();
		horse.eat();
		horse.run();
		horse.sleep();
		System.out.println("horse.area="+horse.area);
		System.out.println("horse.name="+horse.name);
		System.out.println("horse.alive="+horse.alive);
		System.out.println("i am =======");
		
		Animal horse1=new Horse();
		horse1.eat();
		horse1.run();
		horse1.sleep();
		System.out.println("horse1.area="+horse1.area);
		System.out.println("horse1.name="+horse1.name);
		System.out.println("horse1.alive="+horse1.alive);
		System.out.println("i am =======");
		
		
		Animal horse2=new Animal();
		horse2.eat();
		horse2.run();
		horse2.sleep();
		System.out.println("horse2.area="+horse2.area);
		System.out.println("horse2.name="+horse2.name);
		System.out.println("horse2.alive="+horse2.alive);
		
	}
}

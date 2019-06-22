package com.zoumf77.inheritdemo.newdemo;

public class SubClass extends SuperClass implements SuperInterface{
	
	public String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public SubClass(String name, int age,String sex) {
		//其实每个子类构造方法的第一条语句，都是隐含地调用super()，
		//如果父类没有这种形式的构造函数，就会出错
		super(name, age);
		
		this.sex=sex;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registe() {
		// TODO Auto-generated method stub
		System.out.println("registe in subclass");
	}

	/*
	public static void print(){
		System.out.println(" print in subclass ");
	}
	
	public String toString(){
		return super.toString()+";sex="+sex;
	}
	*/
	
	
}

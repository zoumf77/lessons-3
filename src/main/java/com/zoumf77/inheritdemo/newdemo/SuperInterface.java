package com.zoumf77.inheritdemo.newdemo;

public interface SuperInterface {
	
	/*常量可以被继承*/
	String COURSENAME="Java入职实习进阶课";
	
	/*缺省方法可以被子类继承*/
	default int getCourses(){
		return 20;
	}
	
	/*静态方法不能被继承*/
	public static boolean isFree(){
		return true;
	}
	
	/*抽象方法能被继承*/
	public void registe();
}

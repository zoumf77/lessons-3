package com.zoumf77.inheritdemo.newdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestInherit1 {
	public  static void main(String[] args){
	Class<?> clz = SubDemo.class;

	Field[] fields = clz.getFields();
		
	System.out.println("fields===============");
	for (Field field : fields) {
		System.out.println(field.getType()+":"+field.getName());
	}
	
	System.out.println("methods==================");
	Method[] methods=clz.getMethods();
	
	for (Method method:methods){
		System.out.print(method.getName()+":");
		//Class<?>[] paramtypes=method.getParameterTypes();
		Parameter[] parameters=method.getParameters();
		int count=method.getParameterCount();
		if(count==0)
			System.out.println(": no parameters");
		for(int i=0;i<count;i++){
			System.out.print(parameters[i].getType()+":"+parameters[i].getName());
		}
		
		System.out.println("");
	}
	
	
	
	
	//静态变量的访问
	SuperDemo superDemo=new SuperDemo();
	System.out.println(superDemo.name);

	
	SubDemo subDemo=new SubDemo();
	System.out.println(subDemo.name);
	
	SuperDemo superDemo1=new SubDemo();
	System.out.println(superDemo1.name);
	
	}
	
	
}

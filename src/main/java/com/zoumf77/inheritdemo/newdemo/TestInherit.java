package com.zoumf77.inheritdemo.newdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestInherit {

	public static void main(String[] args) {
		/* 子类的 fields */
		Class<?> clz = SubClass.class;

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
		
		
		System.out.println("Constructors==================");
		Constructor<?>[] constructors=clz.getConstructors();
		for(Constructor<?> constructor:constructors){
			System.out.println(constructor.getName()+":");
			
		}
		
		
		
		System.out.println("对超类的常量=========");
		SubClass c1=new SubClass("Jenny",21,"famale");
		
		
		
		SuperClass parent=new SuperClass("Jack",27);
		
		
		
		parent.print();
		
		/*
		 * 父类强制转换成子类
		Subclass child1=(SubClass)parent;
		*/
		
		/*把子类的print注释掉看看，然后取消注释看看*/
		SubClass child=new SubClass("Mike",15,"male");
		child.print();
		
		
		SuperClass p1=new SubClass("Joan",26,"female");
		p1.print();
		
		
		
		System.out.println(parent.toString());
		System.out.println(child.toString());
		System.out.println(p1.toString());
	}
}

package com.zoumf77;

import java.lang.annotation.Annotation;

import com.zoumf77.InheritedAnnotation;
/**
 * 观察子类继承父类的注解
 * @author zmf
 *
 */
public class Horse extends Animal{
	
	
	public void eat(){
		System.out.println("eat grass");
	}
	
	
	public static void main(String[] args){
		
		Horse horse=new Horse();
		
		/*获取子类实例horse的类上的注解*/
		Annotation[] annotation=horse.getClass().getAnnotationsByType(InheritedAnnotation.class);
		
		System.out.println(annotation.length);

		InheritedAnnotation iannotation=(InheritedAnnotation)annotation[0];
		
		/*输出注解的属性值*/
		System.out.println(iannotation.writer());
		
		/*判断子类是否有某个注解*/
		System.out.println(horse.getClass().isAnnotationPresent(InheritedAnnotation.class));
	}
}

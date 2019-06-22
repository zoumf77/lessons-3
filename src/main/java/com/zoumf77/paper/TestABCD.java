package com.zoumf77.paper;

import java.lang.reflect.Method;
/*
1.实例对象为A，参数为对象B，B为A的子类。执行A.class中show(A obj)
2.同上
3.实例对象为A，参数为对象D，执行A.class中show(D obj)
4.实例对象依然为A，参数为B，本应执行A.class中show(A obj)，但是，B.class重写了show(A obj),所以执行B.class show(A obj)
5.同上
6.执行A.class show(D obj) B中并没有重写。
7，8.实例对象为B，参数为B或者B的子类，执行show(B obj)
9.实例对象为B，参数为D，因为B继承自A，也可以执行A中的show(D obj)
*/
public class TestABCD {
	public static void main(String[] args){
		A a1 = new A();  
        A a2 = new B();  
        B b = new B();  
        C c = new C();   
        D d = new D();   
        System.out.println("1:"+a1.show(b));   
        System.out.println("2:"+a1.show(c));   
        System.out.println("3:"+a1.show(d));  
        System.out.println("4:"+a2.show(b));  
        System.out.println("5:"+a2.show(c));  
        System.out.println("6:"+a2.show(d));  
        System.out.println("7:"+b.show(b));   
        System.out.println("8:"+b.show(c));    
        System.out.println("9:"+b.show(d));  
        
        Class<?> clz=a1.getClass();
        Method[] methods=clz.getMethods();
        for(Method method:methods){
        	String paramtype="";
        	for(Class<?> clz1:method.getParameterTypes()){
        		paramtype=paramtype+clz1.getName();
        	}
        	System.out.println(method.getName()+" "+paramtype);
        }
       
	}
}

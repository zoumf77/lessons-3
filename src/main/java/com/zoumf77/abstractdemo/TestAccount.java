package com.zoumf77.abstractdemo;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.junit.Test;

public class TestAccount {

	@Test
	public void test() {
		
		AbstractAccount account=new HousingLoanAccount();
		
		account.setAmount(1000000.00d);
		
		System.out.println("interest="+getInterest(account));
		
		
		Class<?> clz=HousingLoanAccount.class;
		
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
		
		
	}
	
	private double getInterest(AbstractAccount account){
		return account.calculateInterest();
	}

}

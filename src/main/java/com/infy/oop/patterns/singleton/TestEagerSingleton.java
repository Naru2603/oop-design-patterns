package com.infy.oop.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestEagerSingleton {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		EagerSingleton obj1 = EagerSingleton.getInstance();
		EagerSingleton obj2 = EagerSingleton.getInstance();
		
		System.out.println(obj1 == obj2);
		
	
		//Accessing private constructor using Reflection API
		// This will break the Singleton Pattern.
		Constructor<? extends EagerSingleton> constructor = obj2.getClass().getDeclaredConstructor();
		
		constructor.setAccessible(true);
		
		EagerSingleton obj3 = constructor.newInstance();
		
		System.out.println(obj1 == obj3);
		
	}

}

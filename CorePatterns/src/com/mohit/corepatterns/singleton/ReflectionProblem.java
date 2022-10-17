package com.mohit.corepatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DateUtil instance1 = DateUtil.getInstance();
		DateUtil instance2 = null;
		
		Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			System.out.println(constructor.newInstance());
			instance2 =  (DateUtil) constructor.newInstance();
		}
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}

}

package com.mohit.corepatterns.singleton;

public class EnumDemo {

	public static void main(String[] args) {
		SingletonEnum instance = SingletonEnum.INSTANCE;
		System.out.println(instance.getName());
		instance.setName("Mohit");
		instance.setName("Mohit Singh");
		System.out.println(instance.getName());
	}

}

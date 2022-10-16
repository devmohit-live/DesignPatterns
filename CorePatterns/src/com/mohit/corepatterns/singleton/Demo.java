package com.mohit.corepatterns.singleton;

public class Demo {

	public static void main(String[] args) {
		DateUtil du1 = DateUtil.getInstance();
		DateUtil du2 = DateUtil.getInstance();
		
		System.out.println(du1 == du2);
	}

}

package com.mohit.corepatterns.factory;

public class IndianPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Indian Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Indian Pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Indian Pizza");
	}


}

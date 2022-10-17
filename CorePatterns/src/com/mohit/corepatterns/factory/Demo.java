package com.mohit.corepatterns.factory;

public class Demo {

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();
		store.orderPizza("nonveg");
	}

}

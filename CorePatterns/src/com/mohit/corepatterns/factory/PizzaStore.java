package com.mohit.corepatterns.factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		
		//Wrong way : store is taking the responsibility of instantiating the pizza
		Pizza pizza = PizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		return pizza;
	}
}

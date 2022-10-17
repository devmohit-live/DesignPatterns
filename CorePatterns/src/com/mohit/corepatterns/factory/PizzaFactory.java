package com.mohit.corepatterns.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("veg")) pizza = new VegPizza();
		else if(type.equals("nonveg")) pizza = new NonVegPizza();
		else pizza = new IndianPizza();
		return pizza;
	}

}

package com.mohit.corepatterns.decorator;

public class Olives extends ToppingsDecorator{

	BasePizza pizza;
	final int COST = 30;
	
	Olives(BasePizza pizza){
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + this.COST;
	}
	
	
	
}

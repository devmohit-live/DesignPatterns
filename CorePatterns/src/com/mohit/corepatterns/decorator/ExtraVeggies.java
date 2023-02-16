package com.mohit.corepatterns.decorator;

public class ExtraVeggies extends ToppingsDecorator{

	BasePizza pizza;
	final int COST = 50;
	
	ExtraVeggies(BasePizza pizza){
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + this.COST;
	}
	
	
	
}

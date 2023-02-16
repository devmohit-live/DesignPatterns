package com.mohit.corepatterns.decorator;

public class ExtraCheeze extends ToppingsDecorator{

	BasePizza pizza;
	final int COST = 20;
	
	ExtraCheeze(BasePizza pizza){
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + this.COST;
	}
	
	
	
}

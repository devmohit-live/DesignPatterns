package com.mohit.corepatterns.decorator;

public abstract class ToppingsDecorator extends BasePizza{
	BasePizza pizza;

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}
	

}

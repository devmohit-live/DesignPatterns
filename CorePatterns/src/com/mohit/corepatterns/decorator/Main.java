package com.mohit.corepatterns.decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToppingsDecorator pizza = new ExtraVeggies(new Olives(new ExtraCheeze(new ThickCrust())));
		System.out.println(pizza.getCost());
	}

}

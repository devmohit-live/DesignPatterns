package com.mohit.corepatterns.abstractFactory;



public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to DB");
	}

}
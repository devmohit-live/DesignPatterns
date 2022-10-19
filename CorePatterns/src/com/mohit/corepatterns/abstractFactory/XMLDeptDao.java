package com.mohit.corepatterns.abstractFactory;



public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}

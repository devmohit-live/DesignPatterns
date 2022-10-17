package com.mohit.corepatterns.singleton;

import java.io.Serializable;

/*Problem with Serializable => creates new objects*/
public class DateUtil implements Serializable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil instance;
	
	private DateUtil() {
		
	}
	
	
	public static DateUtil getInstance() {
		if(instance == null) {
			synchronized (DateUtil.class) {
				if(instance == null) instance = new DateUtil();
			}
		}
		return instance;
	}
	
	//for serializable 
	//readResolve method is chceked for ObjectInputStream while returning
	public Object readResolve() {
		return instance; //return the same instance
	}
	
}

package com.mohit.corepatterns.singleton;

import java.io.Serializable;

/*Problem with Serializable => creates new objects*/
/*The object should not be clonable*/
public class DateUtil implements Serializable, Cloneable {

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
	protected Object readResolve() {
		return instance; //return the same instance
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		throw new CloneNotSupportedException();
	}
	
	
	
}

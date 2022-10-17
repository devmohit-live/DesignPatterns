package com.mohit.corepatterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable , Cloneable{

	private static final long serialVersionUID = 1L;
	private static volatile Logger instance;
    
    //private constructor
    private Logger(){
        
    }
    
    public static Logger getInstance(){
        if(instance == null){
            //thread safe
            synchronized(Logger.class){
                if(instance == null) instance = new Logger(); //lazy intialization
            }
        }
        
        return instance;
    }
    
    //to implement serializability
    protected Object readResolve(){
        return instance;
    }
    
    //to avoid cloning
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    
}

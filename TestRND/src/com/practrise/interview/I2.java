package com.practrise.interview;

public interface I2 {
	
	public void print() ;
	
	public default void printe() {
        System.out.println("Default ");
    }

}

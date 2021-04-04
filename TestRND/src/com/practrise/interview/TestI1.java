package com.practrise.interview;

public interface TestI1 {
	
	public void print() ;
	
	public default void printe() {
        System.out.println("Default ");
    }

}

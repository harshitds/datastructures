package com.practrise.interview;

class Parent { 
    // Static method in base class 
    // which will be hidden in subclass 
    static void m1() 
    { 
        System.out.println("From parent "
                           + "static m1()"); 
    } 
  
    // Non-static method which will 
    // be overridden in derived class 
    void m2() 
    { 
        System.out.println("From parent "
                           + "non-static(instance) m2()"); 
    } 
}

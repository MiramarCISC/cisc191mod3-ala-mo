package edu.sdccd.cisc191;

import java.util.*;

public class Rectangle extends Shape implements Measurable {
    
    // declaring private fields
    private Integer base;
    private Integer height;
    
    public Rectangle(String name, Integer base, Integer height) { // constructor
        super(name); // reference from Shape class
        
        if (name == null || name.trim().isEmpty() || base < 0 || height < 0) {
            throw new IllegalArgumentException("There is an invalid input for Rectangle.");
        }
        
        // initializing private fields
        this.base = base;
        this.height = height;
    }
    
    // private field getters
    public Integer getBase() {
        return base;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    @Override
    public double area() { // override area() from interface Measurable
        return getBase() * getHeight();
    } 
}
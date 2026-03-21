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
    
    @Override // override area() from interface Measurable
    public double area() { 
        return getBase() * getHeight();
    } 

    @Override // overriding equals()
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
            //recommend adding instanceof check to verify that references point to correct object type
        }
        Rectangle other = (Rectangle) obj;

        return Objects.equals(getName(), other.getName()) && Objects.equals(getBase(), other.getBase()) && Objects.equals(getHeight(), other.getHeight());
    }

    @Override // overriding hashCode()
    public int hashCode() {
        return Objects.hash(getName(), getBase(), getHeight());
    }
}
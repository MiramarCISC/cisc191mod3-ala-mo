package edu.sdccd.cisc191;

import java.util.*;

public class Triangle extends Shape implements Measurable {
    
    // declaring private fields
    private Integer base;
    private Integer width;
    private Integer height;
    
    public Triangle(String name, Integer base, Integer width, Integer height) { // constructor
        super(name); // reference from Shape class
        
        if (name == null || name.trim().isEmpty() || base < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("There is an invalid input for Rectangle.");
        }
        
        // initializing private fields
        this.base = base;
        this.width = width;
        this.height = height;
    }
    
    // private field getters
    public Integer getBase() {
        return base;
    }
    
    public Integer getWidth() {
        return width;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    @Override // override area() from interface Measurable
    public double area() { 
        return 0.5 * getBase() * getHeight();
    } 

    @Override // overriding equals()
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Triangle other = (Triangle) obj;

        return Objects.equals(getName(), other.getName()) && Objects.equals(getBase(), other.getBase()) && Objects.equals(getWidth(), other.getWidth()) && Objects.equals(getHeight(), other.getHeight());
    }

    @Override // overriding hashCode()
    public int hashCode() {
        return Objects.hash(getName(), getBase(), getWidth(), getHeight());
    }
}
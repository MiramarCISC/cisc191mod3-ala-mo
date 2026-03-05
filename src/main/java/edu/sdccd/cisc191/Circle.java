package edu.sdccd.cisc191;

import java.util.*;

public class Circle extends Shape implements Measurable {
    private Integer radius; // declaring private field
    
    public Circle(String name, Integer radius) { // constructor
        super(name); // reference from Shape class
        
        if (name == null || name.trim().isEmpty() || radius < 0) { // parameter validation
            throw new IllegalArgumentException("There is an invalid input for Cirlce.");
        }
        
        this.radius = radius; // initializing private field
    }
    
    public Integer getRadius() { // private field getter
        return radius;
    }
    
    @Override // override area() from interface Measurable
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    } 
}
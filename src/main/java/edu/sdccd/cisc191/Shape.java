package edu.sdccd.cisc191;

public abstract class Shape implements Comparable<Shape> { 
    String name;
    
    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract double area();
    //abstract double perimeter();
    
    public String describe() {
        return "Name=" + getName() + ","; 
    }

    @Override
    public int compareTo(Shape other) {
        return getName().compareTo(other.getName());
    }
}
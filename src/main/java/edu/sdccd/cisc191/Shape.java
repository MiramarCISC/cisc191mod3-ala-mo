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
    //perimeter method should be implemented as part of the parent class abstract methods as shown in the lab requirements
    //public abstract double perimeter();
    
    public String describe() {
        return "Name=" + getName() + ","; 
    }

    @Override
    public int compareTo(Shape other) { // comparing 
        return getName().compareTo(other.getName());
    }
}
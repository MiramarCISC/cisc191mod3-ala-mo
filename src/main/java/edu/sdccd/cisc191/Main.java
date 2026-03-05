package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args){
        
        // creating Shapes ArrayList
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("A",2));
        shapes.add(new Rectangle("B",3,4));
        shapes.add(new Triangle("C",3,4,5));
        
        System.out.println("Shapes: "); // printing shapes
        for(Shape s:shapes) {
            System.out.println(" - " + s.describe() + " area=" + s.area());
        }
        
        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("\nSorted by area (lowest to greatest):");
        /*for (Shape s:shapes) {
            System.out.println(" - " + s.describe() + " area=" + s.area());
        } */
        shapes.forEach(System.out::println);
    }
}
package JAVA_CLG;

import java.util.*;


public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the radius
    public double getRadius() {
        return radius;
        
    }

// Method to calculate the circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    
    public static void main(String[] args) {
        // Creating a circle object with radius 10

        Circle circle = new Circle(10);

            
        // Getting and printing the radius

        double radius = circle.getRadius();
        System.out.println("Radius of the circle: " + radius);

        
        // Calculating and printing the circumference

        double circumference = circle.getCircumference();
        System.out.println("Circumference of the circle: " + circumference);
    }
}

